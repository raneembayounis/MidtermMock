package com.example.midtermmock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("You are in Activity2");

        Button go1=findViewById(R.id.btn_1_act_2);
        Button go3=findViewById(R.id.btn_3_act_2);

        final EditText inp_name=findViewById(R.id.inp_name);
        final EditText inp_year=findViewById(R.id.inp_birthyear);
        final RadioButton r_male=findViewById(R.id.r_male);
        final RadioButton r_female=findViewById(R.id.r_female);

        Button sub = findViewById(R.id.btn_sub);
        go1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });
        go3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity3.class));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gender="";
                if (r_female.isChecked()){
                    gender="Miss";
                }else if(r_male.isChecked()){
                    gender="Mr";
                }

                int year=Integer.valueOf(inp_year.getText()+"");
                int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                year=currentYear-year;
                Toast.makeText(MainActivity2.this,"Hi "+gender+" "+inp_name.getText()+". You are " + year+" years old",Toast.LENGTH_SHORT).show();
            }
        });

    }
}