package com.example.defensedreamers.armymodule;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.defensedreamers.R;
import com.example.defensedreamers.TanksAdapter;
import com.example.defensedreamers.apifilesoftheapp.ApiClient;
import com.example.defensedreamers.apifilesoftheapp.ApiInterface;
import com.example.defensedreamers.modalclassofthearmyapp.Tanksmodal;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Tanks extends AppCompatActivity {

    RecyclerView recyclerView;
    TanksAdapter tankAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanks); // Ensure layout has a RecyclerView with id 'btnTank'

        recyclerView = findViewById(R.id.btnTank);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // Explorer-style grid

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<List<Tanksmodal>> call = apiService.getTanks();

        call.enqueue(new Callback<List<Tanksmodal>>() {
            @Override
            public void onResponse(Call<List<Tanksmodal>> call, Response<List<Tanksmodal>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    tankAdapter = new TanksAdapter(response.body(), tank -> showTankPopup(tank));
                    recyclerView.setAdapter(tankAdapter);
                } else {
                    Log.e("API_FAIL", "Response not successful");
                }
            }

            @Override
            public void onFailure(Call<List<Tanksmodal>> call, Throwable t) {
                Log.e("API_ERROR", t.getMessage());
            }
        });
    }

    private void showTankPopup(Tanksmodal tank) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View popupView = LayoutInflater.from(this).inflate(R.layout.popup_tank_details, null);

        TextView name = popupView.findViewById(R.id.popupTankName);
        TextView details = popupView.findViewById(R.id.popupTankDetails);

        name.setText(tank.getName());
        details.setText("Country: " + tank.getCountry() + "\n"
                + "Speed: " + tank.getSpeed_in_kmph() + " km/h\n"
                + "Weight: " + tank.getWeight() + "\n"
                + "Armor: " + tank.getArmor_thickness() + "\n"
                + "Firepower: " + tank.getFirepower());

        builder.setView(popupView);
        builder.setPositiveButton("Close", (dialog, which) -> dialog.dismiss());
        builder.show();
    }
}
