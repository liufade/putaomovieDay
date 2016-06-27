package com.example.computer.putaomovieday1.movie.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.computer.putaomovieday1.R;
import com.example.computer.putaomovieday1.movie.resp.Cinema;

/**
 * Created by computer on 2016/6/23.
 */
public class CountyAdapter extends ArrayAdapter<Cinema> {
    public CountyAdapter(Context context) {
        super(context,0);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder=null;
        if (viewHolder == null) {
            convertView=View.inflate(parent.getContext(),android.R.layout.simple_list_item_1,null);
            viewHolder=new ViewHolder(convertView);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        Cinema mcinma=getItem(position);

        return convertView;
    }
    class ViewHolder{
        Spinner county_sp;
        ViewHolder(View view){
            county_sp= (Spinner) view.findViewById(R.id.county_sp);
            view.setTag(this);
        }
    }
}
