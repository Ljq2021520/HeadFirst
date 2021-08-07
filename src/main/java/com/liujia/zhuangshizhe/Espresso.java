package com.liujia.zhuangshizhe;
/*
*
* 作为基类咖啡
* */

import com.liujia.zhuangshizhe.Beverage;

public class Espresso extends Beverage {
    private double price=1.99d;
    private String desc="浓缩咖啡";

    @Override
    public double cost() {
        return super.cost();
    }

    @Override
    public String desc() {
        return super.desc();
    }
}
