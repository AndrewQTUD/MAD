package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button myButton;
    TextView txtView;
    EditText edtText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = (Button) findViewById(R.id.button2);
        txtView = (TextView) findViewById(R.id.textView2);
        edtText = (EditText) findViewById(R.id.editText);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtText.getText().toString();
                txtView.setText("Welcome " + name);
            }
        });


        }
    }
