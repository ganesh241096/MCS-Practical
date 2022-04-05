package com.csns.loginapplication.SlipNo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.csns.loginapplication.R;

public class Q1A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);

        String sms = getIntent().getStringExtra("sms");
        Toast.makeText(Q1A.this, ""+sms, Toast.LENGTH_SHORT).show();
    }
}