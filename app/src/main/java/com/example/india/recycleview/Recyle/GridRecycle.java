package com.example.india.recycleview.Recyle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.india.recycleview.R;

import java.util.ArrayList;

public class GridRecycle extends AppCompatActivity {
RecyclerView GridRecyclebar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recycle);
        GridRecyclebar=findViewById(R.id.GridRecyclebar);

        GridRecyclebar.setLayoutManager(new GridLayoutManager(GridRecycle.this,3));

            ArrayList<ItemModel> itemModels= new ArrayList<>();
            for (int i=0;i<10;i++){
                itemModels.add(new ItemModel(R.drawable.shimla,"Shimla","5 days,starting 2000$  | Baraket Travel","Package Name"));
                itemModels.add(new ItemModel(R.drawable.holiday,"World Tour","5 days,starting 2000$  | Baraket Travel","Package Name"));
                itemModels.add(new ItemModel(R.drawable.honey,"Honeymoon","5 days,starting 2000$  | Baraket Travel","Package Name"));
            }
            RecycleAdapter dataAdapter=new RecycleAdapter(this,itemModels);
            GridRecyclebar.setAdapter(dataAdapter);

        }
    }


