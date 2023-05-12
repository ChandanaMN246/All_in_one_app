package com.example.mynewtryouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    Button b6;
    EditText t4;
    TextView v6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        v6=findViewById(R.id.textView10);
        b6=findViewById(R.id.button7);
        t4=findViewById(R.id.editTextNumber4);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(t4.getText().toString());
                double pound=2.20462*a;
                v6.setText("in pounds="+ pound);
            }
        });
    }
}