package com.liujia.zhuangshizhe;

public class Tea extends Beverage {
    private double price=2;
    private String desc="中国红茶哦";

    @Override
    public double cost() {
        return price;
    }

    @Override
    public String desc() {
        return desc;
    }
}
