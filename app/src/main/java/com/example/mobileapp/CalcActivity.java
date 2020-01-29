package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcActivity extends AppCompatActivity {

    TextView result;

    EditText edit1;
    EditText edit2;

    Button buttonPlus, buttonMinus, buttonDiv, buttonMult;

    float num1, num2;
    float result_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        result = findViewById(R.id.textView);
        edit1 = findViewById(R.id.editText1);
        edit2 = findViewById(R.id.editText2);

        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonMult = findViewById(R.id.buttonMult);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(edit1.getText().toString());
                num2 = Integer.parseInt(edit2.getText().toString());
                result_num = num1 + num2;
                result.setText(String.valueOf(result_num));
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(edit1.getText().toString());
                num2 = Integer.parseInt(edit2.getText().toString());
                result_num = num1 - num2;
                result.setText(String.valueOf(result_num));
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(edit1.getText().toString());
                num2 = Float.parseFloat(edit2.getText().toString());
                if(num2 != 0){
                result_num = num1/num2;
                result.setText(String.valueOf(result_num));
                }
                else
                {
                    result.setText("Error:Zero division!");
                }

            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(edit1.getText().toString());
                num2 = Integer.parseInt(edit2.getText().toString());
                result_num = num1 * num2;
                result.setText(String.valueOf(result_num));
            }
        });

    }
}
