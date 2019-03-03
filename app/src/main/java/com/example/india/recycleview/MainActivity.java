package com.example.india.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.ImageView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recycle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycle=findViewById(R.id.recycle);

        recycle.setLayoutManager(new LinearLayoutManager(getApplicationContext()) );

        ArrayList<ItemModel> itemModels= new ArrayList<>();
        for (int i=0;i<10;i++){
            itemModels.add(new ItemModel(R.drawable.shimla,"Deepak","5 days,starting 2000$  | Baraket Travel","Package Name"));
            itemModels.add(new ItemModel(R.drawable.holiday,"Aman","5 days,starting 2000$  | Baraket Travel","Package Name"));
            itemModels.add(new ItemModel(R.drawable.honey,"Aman","5 days,starting 2000$  | Baraket Travel","Package Name"));
        }
        RecycleAdapter dataAdapter=new RecycleAdapter(this,itemModels);
        recycle.setAdapter(dataAdapter);

    }
}
