package com.observerpattern.weatherapp;

public interface Observer {
    
    public void update(float temperature, float humidity, float pressure);
    
}
