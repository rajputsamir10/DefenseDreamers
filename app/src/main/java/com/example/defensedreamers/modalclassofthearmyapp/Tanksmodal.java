package com.example.defensedreamers.modalclassofthearmyapp;

public class Tanksmodal {

        private String name;
        private String country;
        private String weight;
        private float speed_in_kmph;
        private String armor_thickness;
        private String firepower;

        // Constructor
        public Tanksmodal(String name, String country, String weight, float speed_in_kmph, String armor_thickness, String firepower) {
            this.name = name;
            this.country = country;
            this.weight = weight;
            this.speed_in_kmph = speed_in_kmph;
            this.armor_thickness = armor_thickness;
            this.firepower = firepower;
        }

        // Empty Constructor (required for Retrofit or Gson parsing)
        public Tanksmodal() {
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public float getSpeed_in_kmph() {
            return speed_in_kmph;
        }

        public void setSpeed_in_kmph(float speed_in_kmph) {
            this.speed_in_kmph = speed_in_kmph;
        }

        public String getArmor_thickness() {
            return armor_thickness;
        }

        public void setArmor_thickness(String armor_thickness) {
            this.armor_thickness = armor_thickness;
        }

        public String getFirepower() {
            return firepower;
        }

        public void setFirepower(String firepower) {
            this.firepower = firepower;
        }
    }


