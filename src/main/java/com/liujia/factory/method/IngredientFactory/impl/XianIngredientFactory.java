package com.liujia.factory.method.IngredientFactory.impl;

import com.liujia.factory.method.Ingredient.*;
import com.liujia.factory.method.IngredientFactory.IngredientFactonry;

public class XianIngredientFactory implements IngredientFactonry {

    public Beef createBeef() {
        return new Beef();
    }

    public Cheese createCheese() {
        return new Cheese();
    }

    public Garlic createGarlic() {
        return new Garlic();
    }

    public Sausage createSausage() {
        return new Sausage();
    }

    public Tomato createTomato() {
        return new Tomato();
    }

    public Chicken createChicken() {
        return new Chicken();
    }
    public LiangPi createLiangPi() {
        return new LiangPi();
    }

}
