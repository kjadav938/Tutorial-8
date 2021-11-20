package com.example.tutorial_8;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    TextView Tv;
    TextView Tv1;
    TextView Tv2;
    TextView Tv3;
    TextView Tv4;
    TextView Tv5;
    TextView Tv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Tv = (TextView)findViewById(R.id.textView2);
        Tv1= (TextView)findViewById(R.id.textView3);
        Tv2= (TextView)findViewById(R.id.textView4);
        Tv3= (TextView)findViewById(R.id.textView5);
        Tv4= (TextView)findViewById(R.id.textView6);
        Tv5= (TextView)findViewById(R.id.textView7);
        Tv6= (TextView)findViewById(R.id.textView8);
        Intent i = getIntent();
        String sr = i.getStringExtra("fname");
        Tv.setText(sr);
        String sr1 = i.getStringExtra("lname");
        Tv1.setText(sr1);
        String sr2 = i.getStringExtra("p1");
        Tv2.setText(sr2);
        String sr3 = i.getStringExtra("em1");
        Tv3.setText(sr3);
        String sr4 = i.getStringExtra("gender");
        Tv4.setText(sr4);
        String sr5 = i.getStringExtra("branch");
        Tv5.setText(sr5);
        String sr6 = i.getStringExtra("city");
        Tv6.setText(sr6);

    }
}