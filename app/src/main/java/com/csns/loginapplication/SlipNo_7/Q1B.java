package com.csns.loginapplication.SlipNo_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.csns.loginapplication.R;

import java.util.ArrayList;
import java.util.List;

public class Q1B extends AppCompatActivity {

    Spinner spinner;
    EditText etItem;
    Button btnAdd, btnRemove;

    ArrayList<String> items;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1_b2);


        spinner = findViewById(R.id.spinner);
        etItem = findViewById(R.id.etItem);
        btnAdd = findViewById(R.id.btnAdd);
        btnRemove = findViewById(R.id.btnRemove);

        items = new ArrayList<>(); // create empty list
        items.add("abc");

        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String item = etItem.getText().toString().trim();

                if (!items.contains(item)) { //check if item not content in list then add
                    items.add(item);
                }

                System.out.println("ItemsLIst : "+items.size());
                adapter.notifyDataSetChanged();

                etItem.setText("");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String item = etItem.getText().toString().trim();

                if (items.contains(item)) { // check if item exist in list then remove
                    items.remove(item);
                }
                System.out.println("ItemsLIst : "+items.size());
                adapter.notifyDataSetChanged();
                etItem.setText("");
            }
        });


    }
}