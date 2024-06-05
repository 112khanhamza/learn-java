package com.fundamentals.headfirstdesignpatterns.observer;

import lombok.Getter;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.printf("The current weather conditions are: \n\tTemperature: %.2f degrees\n\tHumidity: %.2f\n",
                temperature, humidity);
    }
}
