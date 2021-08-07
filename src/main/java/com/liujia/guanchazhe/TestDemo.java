package com.liujia.guanchazhe;

import com.liujia.guanchazhe.impl.HumShow;
import com.liujia.guanchazhe.impl.TemShow;

public class TestDemo {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        DataShow temShow = new TemShow(weatherData);
        DataShow humShow = new HumShow(weatherData);
        System.out.println("初始化的值");
        temShow.display();
        humShow.display();
        System.out.println("开始更新值");
        weatherData.setChage(12f, 23f, 33f);
        System.out.println("取消温度订阅");
        weatherData.remove(temShow);
        weatherData.setChage(1f, 20f, 99f);






    }
}
