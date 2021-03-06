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

        System.out.println("主分支！！！！");
        System.out.println("分支1，继续修改啦啦啦");
        System.out.println("分支1，继续修改第三次啦啦啦");
        System.out.println("master-1");
        System.out.println("hot-fix2");
        System.out.println("hot-fix2-2");
        System.out.println("hot-fix2-3");
        System.out.println("修改啦啦啦啦");
        System.out.println("修改远程库信息");
        System.out.println("远程xiugai自己库信息");
    }
}

