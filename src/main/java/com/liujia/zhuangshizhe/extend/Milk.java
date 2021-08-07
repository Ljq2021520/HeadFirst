package com.liujia.zhuangshizhe.extend;


import com.liujia.zhuangshizhe.Beverage;

public class Milk extends CondimentDecorator {
    private double price=2;
    private String desc = "牛奶";
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+price;
    }

    @Override
    public String desc() {
        return beverage.desc()+",牛奶";
    }
}
