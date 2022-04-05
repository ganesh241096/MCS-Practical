package com.csns.loginapplication.SlipNo_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.csns.loginapplication.R;

public class Q1ANext extends AppCompatActivity {

    TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1_anext);

        txtResult = findViewById(R.id.txtResult);

        String result = getIntent().getStringExtra("result");

        txtResult.setText("Result :- "+ result);
    }
}