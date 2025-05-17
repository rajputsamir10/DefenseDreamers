package com.example.defensedreamers.modalclassofthearmyapp;

import androidx.annotation.NonNull;

public class Equpimentsmodal {

        private String name;
        private String information;
        private String type;

        public Equpimentsmodal() {
            // Required empty constructor for Retrofit and other JSON parsing libraries
        }

        public Equpimentsmodal(String name, String information, String type) {
            this.name = name;
            this.information = information;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getInformation() {
            return information;
        }

        public void setInformation(String information) {
            this.information = information;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @NonNull
        @Override
        public String toString() {
            return "Equipment{" +
                    "name='" + name + '\'' +
                    ", information='" + information + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }


