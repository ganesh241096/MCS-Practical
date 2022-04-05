package com.csns.loginapplication.SlipNo4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.csns.loginapplication.R;
import com.csns.loginapplication.SlipNo_3.Q1A;
import com.csns.loginapplication.SlipNo_3.Q1ANext;

public class Q1B extends AppCompatActivity {

    EditText etSms;
    Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slip4_a);

        etSms = findViewById(R.id.etSms);
        btnClick = findViewById(R.id.btnClick);


        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  sms = etSms.getText().toString().trim();
                Intent i = new Intent(Q1B.this, com.csns.loginapplication.SlipNo4.Q1A.class);
                i.putExtra("sms",sms);
                startActivity(i);
            }
        });

    }
}