package com.liujia.celue;

public class TestDemo {
    public static void main(String[] args) {
        MultiDuck duck = new MultiDuck(new FlyWay(), new ChiKen());
        duck.fly();
        duck.quack();
        duck.eat();
        System.out.println("改变啦啦啦啦");
        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new Quack());
        duck.fly();
        duck.quack();
        duck.eat();
        System.out.println("修改啦啦啦啦");
        System.out.println("分支1，修改啦啦啦");
    }
}

