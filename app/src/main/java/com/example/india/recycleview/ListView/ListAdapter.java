package com.example.india.recycleview.ListView;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.india.recycleview.R;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<com.example.india.recycleview.ListView.items> {


        int LayoutId;
        ArrayList<items> items;

        public ListAdapter(@NonNull Context context, int resource, ArrayList<items> objects) {
            super(context, resource, objects);

            LayoutId=resource;
            items=objects;
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            items items=getItem(position);
            ViewHolder viewHolder;

            if (convertView==null) {
                viewHolder = new ViewHolder();
                LayoutInflater inflater =  LayoutInflater.from(getContext());
                convertView =  inflater.inflate(LayoutId , parent , false);
                viewHolder.textView = (TextView)convertView.findViewById(R.id.txtView);
                viewHolder.imageView =(ImageView)convertView.findViewById(R.id.img);
                convertView.setTag(viewHolder);

            }else   {
                viewHolder =(ViewHolder)convertView.getTag();
            }
            viewHolder.textView.setText(items.getName());
            viewHolder.imageView.setImageResource(items.getImg());

            return convertView;
        }

        public static class ViewHolder{
            TextView textView;
            ImageView imageView;
        }
    }



