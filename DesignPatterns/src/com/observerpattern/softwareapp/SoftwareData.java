package com.observerpattern.softwareapp;

import java.time.LocalTime;
import java.util.ArrayList;

public class SoftwareData implements Subject{
    
    private ArrayList<Object> observers;
    private float harddisk;
    private float ram;
    private LocalTime start;
    
    public SoftwareData(){
        
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

        for(Object _observer : observers){
            
            Observer observer = (Observer) _observer;
            observer.update(harddisk, ram, start);
            
        }        
        
    }
    
    void valuesChanged(){
        notifyObservers();
    }
    
    public void setValues(float harddisk, float ram, LocalTime start){
        
        this.harddisk = harddisk;
        this.ram = ram;
        this.start = start;
        
        valuesChanged();
        
    }
    
}
