package com.liujia.celue;

public class MultiDuck extends Duck{
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public MultiDuck() {
    }

    public MultiDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    void quack() {
        quackBehavior.sound();
    }

    void fly() {
        flyBehavior.fly();
    }

    void eat() {
        System.out.println("我会吃东西哈哈哈");
    }
}
