package com.observerpattern.softwareapp;

import java.time.LocalTime;

public class LimitsDisplay implements Observer, DisplayElement{
    
    float harddisk = 1000;
    float ram = 32;
    
    Subject softwareData;
    
    public LimitsDisplay(Subject softwareData){
        
        this.softwareData = softwareData;
        softwareData.registerObserver(this);
        
    }
    
    @Override
    public void display() {

        System.out.println("\nRemaining resources: \nHard-disk: " + harddisk + "GB\nRam: " + ram + "GB");
        
    }

    @Override
    public void update(float harddisk, float ram, LocalTime startTime) {

        if(harddisk > this.harddisk){harddisk = this.harddisk;}
        if(ram > this.ram){ram = this.ram;}
        
        this.harddisk -= harddisk;
        this.ram -= ram;
        
        display();
        
        
    }
}
