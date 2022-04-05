package com.csns.loginapplication.SlipNo_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.csns.loginapplication.R;

public class Q1B extends AppCompatActivity {

    EditText username,password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.edtUsername);
        password = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isValid()) {
                    Intent i = new Intent(Q1B.this, Q1BNext.class);
                    startActivity(i);
                }
            }
        });
    }

    private boolean isValid() {
        if(username.getText().toString().equals("")){
            Toast.makeText(Q1B.this, "Enter username", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(password.getText().toString().equals("")){
            Toast.makeText(Q1B.this, "Enter password", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}