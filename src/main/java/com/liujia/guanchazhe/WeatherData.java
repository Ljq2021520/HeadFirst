package com.liujia.guanchazhe;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {
    private float temparature;
    private float humidity;
    private float pressure;
    private List<DataShow> list =new ArrayList<DataShow>();

    public WeatherData() {
    }

    //订阅者注册到出版社
    public void register(DataShow dataShow) {
        list.add(dataShow);
    }

    //取消订阅
    public void remove(DataShow dataShow) {
        for (DataShow dataShow1 : list) {
            if (dataShow.equals(dataShow1)) {
                list.remove(dataShow);
                break;
            }
        }
    }

    //状态更新后进行通知
    public void setChage(float t,float h,float p) {
        this.temparature = t;
        this.humidity = h;
        this.pressure = p;
        notifyShow();
    }

    //通知
    public void notifyShow() {
        for (DataShow dataShow:list ) {
            dataShow.update(temparature,humidity,pressure);
        }
    }

}
