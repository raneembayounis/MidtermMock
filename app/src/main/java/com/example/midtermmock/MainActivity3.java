package com.example.midtermmock;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity3 extends AppCompatActivity {

    int [] items={ R.drawable.num1,R.drawable.num2,R.drawable.num3,R.drawable.num4,R.drawable.num5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("You are in Activity3");

        Button go1=findViewById(R.id.btn_1_act_3);
        Button go2=findViewById(R.id.btn_2_act_3);

        ListView lv=findViewById(R.id.lv);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    startActivity(new Intent(MainActivity3.this,BigImage.class));
                }else{
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com")));
                }
                return;
            }
        });


        go1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity3.this,MainActivity.class));
            }
        });

        go2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity3.this,MainActivity2.class));

            }
        });

    }
}