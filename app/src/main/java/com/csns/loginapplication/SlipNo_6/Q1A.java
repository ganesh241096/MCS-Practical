package com.csns.loginapplication.SlipNo_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.csns.loginapplication.R;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Q1A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);


        Set a = new HashSet();
        a.add(1);
        a.add(2);
        a.add(21);
        Set b = new HashSet();
        b.add(1);
        b.add(22);
        b.add(21);


        a.retainAll(b);
        a.addAll(b);

        System.out.println("Intersection : "+a.retainAll(b));
        System.out.println("Union : "+a.retainAll(b));
    }
}