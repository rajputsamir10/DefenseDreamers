package com.example.defensedreamers.armymodule;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
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
        setContentView(R.layout.activity_tanks); // Make sure layout has a RecyclerView with id 'btnavi'

        recyclerView = findViewById(R.id.btnTank);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<List<Tanksmodal>> call = apiService.getTanks();

        call.enqueue(new Callback<List<Tanksmodal>>() {
            @Override
            public void onResponse(Call<List<Tanksmodal>> call, Response<List<Tanksmodal>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    tankAdapter = new TanksAdapter(response.body());
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
}
