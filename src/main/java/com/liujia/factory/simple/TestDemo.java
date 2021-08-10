package com.liujia.factory.simple;

public class TestDemo {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.createPiza("type2");
        pizza.taste();
    }
}
