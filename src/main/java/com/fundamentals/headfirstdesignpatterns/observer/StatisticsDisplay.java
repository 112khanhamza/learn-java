package com.fundamentals.headfirstdesignpatterns.observer;

public class StatisticsDisplay implements DisplayElement, Observer {

    private float countTemp;
    private float sumTemp;
    private float minTemp = Integer.MAX_VALUE;
    private float maxTemp;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Average/Min/Max Temperature: %.2f, %.2f, %.2f \n", getAverageTemp(), minTemp, maxTemp);
    }

    private float getAverageTemp() {
        return sumTemp/countTemp;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.countTemp++;
        this.sumTemp += temp;
        if (temp < minTemp) minTemp = temp;
        if (temp > maxTemp) maxTemp = temp;
        display();
    }
}
