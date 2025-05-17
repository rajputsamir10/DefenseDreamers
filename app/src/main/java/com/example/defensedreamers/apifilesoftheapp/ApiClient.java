package com.example.defensedreamers.apifilesoftheapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

        private static final String BASE_URL = "http://192.168.2.116:8080/"; // your Django API base URL
        private static Retrofit retrofit = null;

        public static Retrofit getClient() {//k
            if (retrofit == null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofit;
        }
    }


