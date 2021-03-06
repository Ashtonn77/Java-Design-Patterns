package com.observerpattern.java.builtin.observer;


import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    
    Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;
    
    public ForecastDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    
    @Override
    public void display() {

        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(Observable observable, Object o) {
        
        if(observable instanceof WeatherData){
            
            WeatherData weatherData = (WeatherData) observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
            
        }
        
        
    }
}
