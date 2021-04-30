package com.observerpattern.softwareapp;

public interface Subject {
    
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    
}
