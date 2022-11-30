package com.example.bkt3trongnghia;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyArrayAdapter1 extends ArrayAdapter<tacpham> {
    Activity context;
    int IdLayout;
    ArrayList<tacpham> myList;

    public MyArrayAdapter1(Activity context, int idLayout, ArrayList<tacpham> myList) {
        super(context, idLayout,myList);
        this.context = context;
        IdLayout = idLayout;
        this.myList = myList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater myflater = context.getLayoutInflater();
        convertView = myflater.inflate(IdLayout,null);
        tacpham myoto =myList.get(position);
        TextView txt_Tacpham=convertView.findViewById(R.id.txt_tacpham);
        txt_Tacpham.setText(myoto.getName());
        return convertView;
    }
}
