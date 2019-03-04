package com.example.india.recycleview.ListView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.india.recycleview.R;

import java.util.ArrayList;
import java.util.List;

public class ListPage extends AppCompatActivity {
    ListView ListDemo;

    private  static ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_page);

        ListDemo = findViewById(R.id.ListDemo);

        ArrayList<items> items=new ArrayList<>();
        for (int i=0;i<20;i++){
            items.add(new items(R.drawable.shimla,"Shimla"));
            items.add(new items(R.drawable.honey,"Couples"));
            items.add(new items(R.drawable.holiday,"Holiday Package"));

        }
        ListAdapter listAdapter=new ListAdapter(this,R.layout.listdesign,items);
        ListDemo.setAdapter(listAdapter);


    }

    private void setUpListItemClickListner(){
        ListDemo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListPage.this, "item"+position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
