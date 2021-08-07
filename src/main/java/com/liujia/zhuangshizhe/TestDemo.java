package com.liujia.zhuangshizhe;

import com.liujia.zhuangshizhe.extend.Milk;
import com.liujia.zhuangshizhe.extend.Moka;

public class TestDemo {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        beverage = new Moka(beverage);
        System.out.println(beverage.desc()+"$"+beverage.cost());

        Beverage tea = new Tea();
        tea = new Milk(tea);
        System.out.println(tea.desc()+" $"+tea.cost());


    }
}
