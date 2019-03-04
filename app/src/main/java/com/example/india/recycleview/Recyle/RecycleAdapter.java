package com.example.india.recycleview.Recyle;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.india.recycleview.R;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ItemViewHolder> {

    Context context;
    ArrayList<ItemModel> itemModels;


    public RecycleAdapter(Context context,ArrayList<ItemModel> itemModels){
        this.context=context;
        this.itemModels=itemModels;
    }


    @Override
    public RecycleAdapter.ItemViewHolder onCreateViewHolder( ViewGroup parent,int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.recycle_row,parent,false);
        return new ItemViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull RecycleAdapter.ItemViewHolder itemViewHolder, int position) {
        ItemModel itemModel=itemModels.get(position);
        itemViewHolder.textView1.setText(itemModel.Pack);
        itemViewHolder.textView.setText(itemModel.Description);

        itemViewHolder.imageView.setImageResource(itemModel.img);
    }

    @Override
    public int getItemCount() {return itemModels.size();}





    public class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textView1;
        ImageView imageView;
        Button button;

        public ItemViewHolder(View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.PackageName);
            textView1=itemView.findViewById(R.id.Description);
            imageView=itemView.findViewById(R.id.img);
            button=itemView.findViewById(R.id.Submit);


        }
    }
}
