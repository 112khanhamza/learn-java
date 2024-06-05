package com.fundamentals.headfirstdesignpatterns.observer;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
