// Army.java
package com.example.defensedreamers.armymodule;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


import com.example.defensedreamers.R;


public class Army extends AppCompatActivity {
   Button btnTank;
   Button btnavi;
   Button btnEQU;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_army); // Make sure this layout exists
        btnTank = findViewById(R.id.btnTank);
        btnTank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Army.this, Tanks.class);
                startActivity(intent);
            }// Handle button click
        });
        btnavi = findViewById(R.id.btnavi);
        btnavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Army.this, Aviations.class);
                startActivity(intent);
            }// Handle button click
        });


        btnEQU = findViewById(R.id.btnEQU);
                btnEQU.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Army.this, Equpiments.class);
                        startActivity(intent);
                    }// Handle button click
                });

    }
}
