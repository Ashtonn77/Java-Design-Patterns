package com.observerpattern.softwareapp;

import java.time.LocalTime;

public class CurrentDisplay implements Observer, DisplayElement{
    
    float harddisk;
    float ram;
    LocalTime start;
    
    Subject softwareData;
    
    public CurrentDisplay(Subject softwareData){
        this.softwareData = softwareData;
        softwareData.registerObserver(this);
    }
    
    @Override
    public void display() {

        System.out.println("\nCurrent usage: \nSpace on hard-disk: " + harddisk + "\nMemory usage: " + ram + "\nStart time: " + start);
        
    }

    @Override
    public void update(float harddisk, float ram, LocalTime startTime) {
            
            this.harddisk = harddisk;
            this.ram = ram;
            this.start = startTime;
            
            display();
        
    }
}
