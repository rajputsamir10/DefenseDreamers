package com.example.defensedreamers.airforcemodule;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.defensedreamers.R;

public class Airforce extends AppCompatActivity {

    Button btnheli;
    Button btnjet;
    Button btnCARGO;
    Button btnRDR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_airforce);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Helicopter
        btnheli = findViewById(R.id.btnheli);
        btnheli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Airforce.this, helicopters.class);
                startActivity(intent);
            }
        });

        // Jet
        btnjet = findViewById(R.id.btnjet);
        btnjet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Airforce.this, jets.class);
                startActivity(intent);
            }
        });

        // Fighter Jets
        btnCARGO = findViewById(R.id.btnCARGO);
        btnCARGO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Airforce.this, planes.class);
                startActivity(intent);
            }
        });

        // Radar
        btnRDR = findViewById(R.id.btnRDR);
        btnRDR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Airforce.this, radar.class);
                startActivity(intent);
            }
        });
    }
}
