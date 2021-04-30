package com.observerpattern.weatherapp;

import java.util.ArrayList;

public class WeatherData implements Subject{
    
    private final ArrayList<Object> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        
        observers = new ArrayList<>();
        
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        
        int i = observers.indexOf(observer);
        if(i >= 0){
            observers.remove(i);
        }
        
    }

    @Override
    public void notifyObservers() {

        for (Object _observer : observers) {

            Observer observer = (Observer) _observer;
            observer.update(temperature, humidity, pressure);

        }
        
    }
    
    public void measurementsChanged(){
        
        notifyObservers();
        
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure){
        
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        
        measurementsChanged();
        
    }
    
}
