package com.example.mynewtryouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1,b2,b3,b4,b5,b6;
        TextView v;
        b1=findViewById(R.id.button2);
        b2=findViewById(R.id.button);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button6);
        b5=findViewById(R.id.button8);
        b6=findViewById(R.id.button9);

        v=findViewById(R.id.textView);
    }
    public void show(View view)
    {
        Intent i=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(i);
    }
    public void show2(View view)
    {
        Intent i=new Intent(MainActivity.this,MainActivity3.class);
        startActivity(i);
    }
    public void show3(View view)
    {
        Intent i=new Intent(MainActivity.this,MainActivity4.class);
        startActivity(i);
    }
    public void show4(View view)
    {
        Intent i=new Intent(MainActivity.this,MainActivity5.class);
        startActivity(i);
    }
    public void show5(View view)
    {
        Intent i=new Intent(MainActivity.this,MainActivity6.class);
        startActivity(i);
    }
    public void show6(View view)
    {
        Intent i=new Intent(MainActivity.this,MainActivity7.class);
        startActivity(i);
    }
}