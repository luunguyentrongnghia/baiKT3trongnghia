package com.example.bkt3trongnghia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class supActivity extends AppCompatActivity {
    TextView txt_supoto;
    ImageView imgp;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sup);
        txt_supoto=findViewById(R.id.txt_suboto);
        back=(Button) findViewById(R.id.buttonback);
        ControlButton();
        Intent myintent = getIntent();
         String namephone = myintent.getStringExtra("name");
         txt_supoto.setText(namephone);


    }
    private void ControlButton(){
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}