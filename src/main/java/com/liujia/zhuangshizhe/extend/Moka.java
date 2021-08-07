package com.liujia.zhuangshizhe.extend;


import com.liujia.zhuangshizhe.Beverage;

public class Moka extends CondimentDecorator {
    private double price=12;
    private String desc = "摩卡";
    Beverage beverage;

    public Moka(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+price;
    }

    @Override
    public String desc() {
        return beverage.desc()+",摩卡";
    }
}
