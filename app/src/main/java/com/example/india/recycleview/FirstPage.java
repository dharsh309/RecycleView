package com.example.india.recycleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.india.recycleview.ListView.ListPage;
import com.example.india.recycleview.Recyle.RecyclePage;

public class FirstPage extends AppCompatActivity {
 Button Review,list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        list=findViewById(R.id.list);
        Review=findViewById(R.id.Review);


        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(FirstPage.this,ListPage.class);
                startActivity(i);
            }
        });
        Review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(FirstPage.this,RecyclePage.class);
                startActivity(a);
            }
        });
    }
}
