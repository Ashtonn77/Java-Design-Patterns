package com.observerpattern.java.builtin.observer;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        
        weatherData.setMeasurements(80, 56, 20.3f);
        weatherData.setMeasurements(85.5f, 99, 20);
    }
    
}
