package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaring items
    Button calc;
    TextView Bill;
    TextView tipPercent;
    TextView Tiptotal;
    TextView total;
    EditText BillTotal;
    EditText TipAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc = (Button) findViewById(R.id.button);
        Bill = (TextView) findViewById((R.id.textView));
        tipPercent = (TextView) findViewById((R.id.textView2));
        Tiptotal = (TextView) findViewById((R.id.textView3));
        total = (TextView)findViewById((R.id.textView4));
        BillTotal = (EditText)findViewById(R.id.editText3);
        TipAmount = (EditText)findViewById((R.id.editText2));


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getTotal = BillTotal.getText().toString();
                String getTip = TipAmount.getText().toString();

                int displayTotal = Integer.parseInt(getTotal);
                int displayTip = Integer.parseInt(getTip);

                float i = (displayTotal * displayTip) / 100;

                float ii = i + displayTotal;

                total.setText("Total tip amount : " +String.valueOf(i));
                Tiptotal.setText("Total amount : " + String.valueOf(ii));


            }
        });
    }
}