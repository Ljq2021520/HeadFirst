package com.liujia.factory.method.Pizza;

import com.liujia.factory.method.Ingredient.Beef;
import com.liujia.factory.method.Ingredient.Cheese;
import com.liujia.factory.method.Ingredient.Garlic;
import com.liujia.factory.method.Ingredient.Tomato;

public abstract class Pizza {
    String name;
    Beef beef;
    Cheese cheese;
    Garlic garlic;
    Tomato tomato;

    abstract void prepare();
    abstract void  make();

}
