package com.example.mynewtryouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    Button b5;
    EditText t3;
    TextView v5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        v5=findViewById(R.id.textView6);
        b5=findViewById(R.id.button4);
        t3=findViewById(R.id.editTextNumber3);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n=Integer.parseInt(t3.getText().toString());
                String result="";
                for(int i=1;i<=10;i++)
                {
                    result+=i +"*"+n+"="+i*n+"\n";
                    v5.setText(String.valueOf(result));
                }
            }
        });
    }
}