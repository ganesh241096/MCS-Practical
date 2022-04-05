package com.csns.loginapplication.SlipNo_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.csns.loginapplication.R;

public class Q1A extends AppCompatActivity {

    EditText etFirstNo,etSecNo;
    Button btnPower,btnSum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

        etFirstNo = findViewById(R.id.etFirstNo);
        etSecNo = findViewById(R.id.etSecNo);
        btnPower = findViewById(R.id.btnPower);
        btnSum = findViewById(R.id.btnSum);


        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float sum = Float.parseFloat(etFirstNo.getText().toString())+Float.parseFloat(etSecNo.getText().toString());

                Intent i = new Intent(Q1A.this,Q1ANext.class);
                i.putExtra("result",sum+"");
                startActivity(i);
            }
        });



        btnPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float no1 = Float.parseFloat(etFirstNo.getText().toString());
                float no2 = Float.parseFloat(etSecNo.getText().toString());
                float power = (float) Math.pow(no1,no2);

                Intent i = new Intent(Q1A.this,Q1ANext.class);
                i.putExtra("result",power+"");
                startActivity(i);
            }
        });
    }
}