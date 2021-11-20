package com.example.tutorial_8;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.os.Bundle;

public class welcome extends AppCompatActivity {
    TextView Tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        setContentView(R.layout.activity_welcome);

        Tv = (TextView)findViewById(R.id.textView2);
        Intent i =getIntent();
        String sr = i.getStringExtra("Email");
        Tv.setText(sr);
    }
}