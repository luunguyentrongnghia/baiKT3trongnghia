package com.example.bkt3trongnghia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int image[]={R.drawable.tohuu,R.drawable.xuanquynh,R.drawable.huycan,R.drawable.nguyendu,R.drawable.thanhquan};
    String name[] = {"tohuu","xuanquynh","huycan","nguyendu","thanhquan"};
    ArrayList<Tacgia> myList;
    MyArrayAdapter myadapter;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        myList = new ArrayList<>();
        for (int i = 0;i<name.length;i++){
            myList.add(new Tacgia(image[i],name[i]));
        }
        myadapter = new MyArrayAdapter(MainActivity.this,R.layout.layout_item,myList);
        lv.setAdapter(myadapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent myintent = new Intent(MainActivity.this,MainActivitytacpham.class);
                if(name[i]=="tohuu"){
                    myintent.putExtra("name","từ ấy");
                    myintent.putExtra("name1","Việt Bắc");
                    myintent.putExtra("name2","Gió lộng");
                    myintent.putExtra("name3","Ra trận");
                    myintent.putExtra("name4","Máu và Hoa");
                }
                if(name[i]=="xuanquynh"){
                    myintent.putExtra("name","song");
                    myintent.putExtra("name1","Tự hát");
                    myintent.putExtra("name2","Thuyền và biển");
                    myintent.putExtra("name3","Mẹ của anh");
                    myintent.putExtra("name4","Thơ tình cuối mùa thu");
                }
                if(name[i]=="huycan"){
                    myintent.putExtra("name","Đất nở hoa");
                    myintent.putExtra("name1","Trời mỗi ngày lại sáng");
                    myintent.putExtra("name2","Bài thơ cuộc đời ");
                    myintent.putExtra("name3","Hai bàn tay em ");
                    myintent.putExtra("name4","Phù Đổng Thiên Vương");
                }
                if(name[i]=="nguyendu"){
                    myintent.putExtra("name","truyện kiều");
                    myintent.putExtra("name1","Độc Tiểu Thanh ký");
                    myintent.putExtra("name2","Văn tế thập loại chúng sinh");
                    myintent.putExtra("name3","Đối tửu");
                    myintent.putExtra("name4","Sở kiến hành");
                }
                if(name[i]=="thanhquan"){
                    myintent.putExtra("name","Qua đèo Ngang");
                    myintent.putExtra("name1","Thăng Long thành hoài cổ");
                    myintent.putExtra("name2","qua chùa Trấn Bắc");
                    myintent.putExtra("name3","Chiều hôm nhớ nhà");
                    myintent.putExtra("name4","Cảnh đền Trấn Võ");
                }



                startActivity(myintent);
            }
        });
    }
}