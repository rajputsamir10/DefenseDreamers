package com.example.defensedreamers.apifilesoftheapp;

import com.example.defensedreamers.modalclassofthearmyapp.Tanksmodal;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("army/tanks/")

    Call<List<Tanksmodal>> getTanks();
}
