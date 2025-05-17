package com.example.defensedreamers.apifilesoftheapp;

import com.example.defensedreamers.modalclassofthearmyapp.Tanksmodal;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    // This should match the endpoint in your Django project, e.g.:
    // http://192.168.2.100:8080/api/tanks/
    @GET("http://192.168.2.116:8080/army/tanks/")
    Call<List<Tanksmodal>> getTanks();
}
