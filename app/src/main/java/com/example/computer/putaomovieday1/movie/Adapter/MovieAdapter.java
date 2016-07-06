package com.example.computer.putaomovieday1.movie.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.computer.putaomovieday1.R;
import com.example.computer.putaomovieday1.common.core.PMApplication;
import com.example.computer.putaomovieday1.common.util.T;
import com.example.computer.putaomovieday1.movie.resp.movie;
import com.example.computer.putaomovieday1.common.util.BitmapCache;
import com.example.computer.putaomovieday1.movie.ui.CinemaListActivity;

import java.util.List;

/**
 * Created by computer on 2016/6/22.
 */
public class MovieAdapter extends BaseAdapter{
    List<movie> mData;
    private ImageLoader imageLoader;

    public MovieAdapter(List<movie> data){
        mData=data;
        imageLoader=new ImageLoader(PMApplication.getsIntance().getRequestQueue(),new BitmapCache());
    }

    @Override
    public int getCount() {
        //作判断，防止空指针
        return mData==null?0:mData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder=null;
        if (convertView==null){
            convertView=View.inflate(parent.getContext(), R.layout.movie_item_fragmemt,null);
            viewHolder=new ViewHolder(convertView);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
       final movie mMovie=mData.get(position);

        viewHolder.nameTv.setText(mMovie.getMoviename());
        viewHolder.posterNiv.setImageUrl(mMovie.getLogo(),imageLoader);
        viewHolder.ratingBar.setRating(Float.parseFloat(mMovie.getGeneralmark()) / 2);
        viewHolder.gceditionTv.setText(mMovie.getGcedition());
        viewHolder.buyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context= v.getContext();
                Intent intent=new Intent(context, CinemaListActivity.class);
                intent.putExtra("movieName",mMovie.getMoviename());
                intent.putExtra("movieId",mMovie.getMovieid());
                context.startActivity(intent);
            }
        });
        return convertView;
    }

    private final class ViewHolder{
        NetworkImageView posterNiv;
        TextView nameTv;
        TextView ratingTv;
        TextView gceditionTv;
        TextView buyBtn;
        RatingBar ratingBar;
        public ViewHolder(View view){
            nameTv= (TextView) view.findViewById(R.id.movie_item_text);
            posterNiv= (NetworkImageView) view.findViewById(R.id.movie_item_img);
            ratingTv= (TextView) view.findViewById(R.id.rating_tx);
            gceditionTv=(TextView)view.findViewById(R.id.movie_item_gcedition);
            buyBtn= (TextView) view.findViewById(R.id.movie_item_buy_btn);
            ratingBar= (RatingBar) view.findViewById(R.id.rating_rb);
            view.setTag(this);
        }
    }
}
