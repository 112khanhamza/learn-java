package com.fundamentals.headfirstdesignpatterns.observer.builtinsupport;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements DisplayElement, Observer {

    private float countTemp;
    private float sumTemp;
    private float minTemp = Integer.MAX_VALUE;
    private float maxTemp;
    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Average/Min/Max Temperature: %.2f, %.2f, %.2f \n", getAverageTemp(), minTemp, maxTemp);
    }

    private float getAverageTemp() {
        return sumTemp/countTemp;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            float currentTemp = weatherData.getTemperature();
            this.countTemp++;
            this.sumTemp += currentTemp;
            if (currentTemp < minTemp) minTemp = currentTemp;
            if (currentTemp > maxTemp) maxTemp = currentTemp;
            display();
        }
    }
}
