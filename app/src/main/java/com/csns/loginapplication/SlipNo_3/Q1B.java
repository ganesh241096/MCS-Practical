package com.csns.loginapplication.SlipNo_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.csns.loginapplication.R;

import java.util.Locale;

public class Q1B extends AppCompatActivity {

    EditText etString;
    RadioGroup rdGrp;
    TextView txtOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1_b);

        etString = findViewById(R.id.etString);
        rdGrp = findViewById(R.id.rdGrp);
        txtOutput = findViewById(R.id.txtOutput);

        rdGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {

                String input = etString.getText().toString().trim();

                switch (id){
                    case R.id.uppercase :
                        String output = input.toUpperCase();
                        txtOutput.setText(output);
                        break;

                    case R.id.lowercase:
                        String output1 = input.toLowerCase();
                        txtOutput.setText(output1);
                        break;

                    case R.id.right5:
                        String right5 ="";

                        if (input.length() > 5)
                        {
                            right5 = input.substring(input.length() - 5);
                        }
                        else
                        {
                            right5 = input;
                        }
                        txtOutput.setText(right5);
                        break;
                    case R.id.left5:
                        String left5 ="";

                        if (input.length() > 5)
                        {
                            left5 = input.substring(0,5);
                        }
                        else
                        {
                            left5 = input;
                        }
                        txtOutput.setText(left5);
                        break;



                }
            }
        });
    }
}