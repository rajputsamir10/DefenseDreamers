package com.example.defensedreamers.navymodule;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.defensedreamers.R;

public class Navy extends AppCompatActivity {
    Button btnwar;
    Button btnsub;
    Button btnafa;
    Button btnmiss;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_navy);
        btnwar = findViewById(R.id.btnwar);
        btnwar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Navy.this, warships.class);
                startActivity(intent);
            }// Handle button click
        });
        btnsub = findViewById(R.id.btnsub);
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Navy.this, Submarine.class);
                startActivity(intent);
            }// Handle button click
        });


        btnafa = findViewById(R.id.btnafa);
        btnafa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Navy.this, Aircraft.class);
                startActivity(intent);
            }// Handle button click
        });
        btnmiss = findViewById(R.id.btnmiss);
        btnmiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Navy.this, Missiles.class);
                startActivity(intent);
            }// Handle button click
        });

    }}