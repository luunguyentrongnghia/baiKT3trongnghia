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

public class MyArrayAdapter extends ArrayAdapter<Tacgia> {
    Activity context;
    int IdLayout;
    ArrayList<Tacgia> myList;

    public MyArrayAdapter(Activity context, int idLayout, ArrayList<Tacgia> myList) {
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
        Tacgia myoto =myList.get(position);
        ImageView img_Tacgia = convertView.findViewById(R.id.img_tacgia);
        img_Tacgia.setImageResource(myoto.getImage());
        TextView txt_Tacgia=convertView.findViewById(R.id.txt_tacgia);
        txt_Tacgia.setText(myoto.getName());
        return convertView;
    }
}
