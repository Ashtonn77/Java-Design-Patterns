package com.observerpattern.softwareapp;

import java.time.LocalTime;

public interface Observer {
    
    void update(float harddisk, float ram, LocalTime startTime);
    
}
