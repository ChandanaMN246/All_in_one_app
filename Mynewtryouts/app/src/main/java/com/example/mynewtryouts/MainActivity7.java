package com.example.mynewtryouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {
     public TextView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        v=findViewById(R.id.textView12);
        //v.getMovementMethod(new ScrollingMovementMethod());

    }
}