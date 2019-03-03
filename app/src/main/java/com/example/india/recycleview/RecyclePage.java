package com.example.india.recycleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecyclePage extends AppCompatActivity {
Button gridrecycle,Linerecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclepage);
        gridrecycle=findViewById(R.id.gridrecycle);
        Linerecycle=findViewById(R.id.Linerecycle);

     gridrecycle.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent g=new Intent(RecyclePage.this,GridRecycle.class);
             startActivity(g);
         }
     });
     Linerecycle.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent l=new Intent(RecyclePage.this,MainActivity.class);
             startActivity(l);
         }
     });
    }
}
