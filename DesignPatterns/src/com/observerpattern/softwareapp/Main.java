package com.observerpattern.softwareapp;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        
        SoftwareData softwareData = new SoftwareData();
        CurrentDisplay currentDisplay = new CurrentDisplay(softwareData);
        LimitsDisplay limitsDisplay = new LimitsDisplay(softwareData);
        
        
        softwareData.setValues(250, 8, LocalTime.now());
        softwareData.setValues(268, 16, LocalTime.now());
        
    }
    
}
