package com.example.bkt3trongnghia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivitytacpham extends AppCompatActivity {
    ArrayList<tacpham> myList;
    MyArrayAdapter1 myadapter;
    ListView lv1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintacpham);

        Intent myintent = getIntent();
        String name = myintent.getStringExtra("name");
        String name1 = myintent.getStringExtra("name1");
        String name2 = myintent.getStringExtra("name2");
        String name3 = myintent.getStringExtra("name3");
        String name4 = myintent.getStringExtra("name4");

        lv1 = findViewById(R.id.lv1);
        myList = new ArrayList<>();
        myList.add(new tacpham(name));
        myList.add(new tacpham(name1));
        myList.add(new tacpham(name2));
        myList.add(new tacpham(name3));
        myList.add(new tacpham(name4));

        myadapter = new MyArrayAdapter1(MainActivitytacpham.this,R.layout.layout_itemtp,myList);
        lv1.setAdapter(myadapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent myintent = new Intent(MainActivitytacpham.this,supActivity.class);

                myintent.putExtra("name",name);
                startActivity(myintent);
            }
        });
    }
}
