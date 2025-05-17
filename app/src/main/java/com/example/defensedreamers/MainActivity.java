package com.example.defensedreamers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.defensedreamers.airforcemodule.Airforce;
import com.example.defensedreamers.armymodule.Army;
import com.example.defensedreamers.navymodule.Navy;
import com.example.defensedreamers.nccmodule.Ncc;

public class MainActivity extends AppCompatActivity {

    Button btnArmy;
    Button btnNavy;
    Button btnAirforce;
    Button btnNCC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        btnArmy = findViewById(R.id.btnArmy); // Ensure your button ID matches this

        btnArmy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Army.class);
                startActivity(intent);
            }
        });
        btnNavy = findViewById(R.id.btnNavy); // Ensure your button ID matches this
        btnNavy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Navy.class);
                startActivity(intent);
            }
        });
        btnAirforce =findViewById(R.id.btnAirforce);
        btnAirforce.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Airforce.class);
                startActivity(intent);

                                       }});
        btnNCC =findViewById(R.id.btnNCC);
        btnNCC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, Ncc.class);
                startActivity(intent);
        }});


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btnNCC), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
