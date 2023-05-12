package com.example.mynewtryouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import java.text.BreakIterator;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button b4;
        TextView v1,v2,v3,v4;
        EditText t1,t2;

        v1=findViewById(R.id.textView3);
        v2=findViewById(R.id.textView5);
        v3=findViewById(R.id.textView7);
        v4=findViewById(R.id.textView8);
        b4=findViewById(R.id.button5);
        t1=findViewById(R.id.editTextNumber2);
        t2=findViewById(R.id.editTextNumber);


        b4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(t1.getText().toString());
                int b=Integer.parseInt(t2.getText().toString());
                int c=a+b;
                v4.setText(String.valueOf(c));
            }
        });
    }

}
//https://www.codewithharry.com/videos/android-tutorial-in-hindi-with-notes/