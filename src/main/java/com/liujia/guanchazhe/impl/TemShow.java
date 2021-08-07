package com.liujia.guanchazhe.impl;

import com.liujia.guanchazhe.DataShow;
import com.liujia.guanchazhe.WeatherData;

public class TemShow implements DataShow {
    private float temparature = 0.00f;
    private float humidity= 0.00f;
    private float pressure= 0.00f;

    public TemShow(WeatherData weatherData) {
        weatherData.register(this);
    }

    public float getTemparature() {
        return temparature;
    }

    public void setTemparature(float temparature) {
        this.temparature = temparature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }


    public void display() {
        System.out.println("温度面板：温度："+temparature+";湿度："+humidity+";压强："+pressure);
    }

    public void register(Object object) {
        WeatherData weatherData = (WeatherData) object;
        weatherData.register(this);
    }

    public void update(float t, float h, float p) {
        this.temparature = t;
        this.humidity = h;
        this.pressure = p;
        display();
    }
}
