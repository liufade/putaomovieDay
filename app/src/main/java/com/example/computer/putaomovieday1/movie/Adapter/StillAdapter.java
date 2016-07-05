package com.example.computer.putaomovieday1.movie.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.computer.putaomovieday1.R;
import com.example.computer.putaomovieday1.movie.util.IOnItemClickListener;

/**
 * 剧照适配器
 * Created by computer on 2016/7/5.
 */
public class StillAdapter extends RecyclerView.Adapter<StillViewHolder>{

    private String[] stills;
    private ImageLoader imageLoader;
    IOnItemClickListener onItemClickListener;

    public StillAdapter( ImageLoader imageLoader,String[] stills) {
        this.stills = stills;
        this.imageLoader = imageLoader;
    }

    @Override
    public StillViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        return new StillViewHolder(View.inflate(context,R.layout.movie_dtl_stills_item,null));
    }

    @Override
    public void onBindViewHolder(StillViewHolder holder, final int position) {
         String stillUrl=stills[position];
        holder.imv.setImageUrl(stillUrl,imageLoader);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClickListener!=null){
                    onItemClickListener.onItemClick(v,position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public IOnItemClickListener getOnItemClickListener() {
        return onItemClickListener;
    }

    public void setOnItemClickListener(IOnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }
}

class StillViewHolder extends  RecyclerView.ViewHolder{

    NetworkImageView imv;
    public StillViewHolder(View itemView) {
        super(itemView);
        imv= (NetworkImageView) itemView.findViewById(R.id.img_movie_dtl_stills);

    }
}