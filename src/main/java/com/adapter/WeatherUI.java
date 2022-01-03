package com.adapter;

public class WeatherUI {
    public int findWeather(int zip){
        //We cannot use the zip as such since WeatherFinderImpl expects the city name and not the zip code.
//        WeatherFinder weatherFinder = new WeatherFinderImpl();
//        weatherFinder.find(zip);

//        To resolve the above issue we go with adapter pattern.
        WeatherAdapter weatherAdapter = new WeatherAdapter();
        return weatherAdapter.findTemperature(zip);

    }

    public static void main(String[] args) {
        int zipCode = 600049;
        WeatherUI weatherUI = new WeatherUI();
        System.out.println(weatherUI.findWeather(zipCode));
    }
}
