package com.adapter;

public class WeatherAdapter {
    public int findTemperature(int zip){
        String cityName = null;
        if(zip == 600049){
            cityName = "Chennai";
        }
        WeatherFinderImpl weatherFinderimpl = new WeatherFinderImpl();
        return weatherFinderimpl.find(cityName);
    }
}
