package com.liujia.factory.simple;

import com.liujia.factory.simple.impl.Piazza1;
import com.liujia.factory.simple.impl.Piazza2;
import com.liujia.factory.simple.impl.Piazza3;

public class PizzaFactory {
   private Pizza pizza;

    public PizzaFactory() {
    }

    public PizzaFactory(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pizza createPiza(String type) {
        if (type.equals("type1")) {
            if (pizza == null) {
                pizza = new Piazza1();
            }

        } else if (type.equals("type2")) {
            if (pizza == null) {
                pizza = new Piazza2();
            }

        } else if (type.equals("type3")) {
            if (pizza == null) {
                pizza = new Piazza3();
            }
        }
        return pizza;
    }
}
