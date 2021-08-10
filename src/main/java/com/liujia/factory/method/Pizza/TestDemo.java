package com.liujia.factory.method.Pizza;

import com.liujia.factory.method.IngredientFactory.IngredientFactonry;
import com.liujia.factory.method.IngredientFactory.impl.BeiJingIngredientFactory;
import com.liujia.factory.method.IngredientFactory.impl.XianIngredientFactory;
import com.liujia.factory.method.Pizza.BeiJingPizza;

public class TestDemo {
    public static void main(String[] args) {
        IngredientFactonry ingredientFactonry = new BeiJingIngredientFactory();
        IngredientFactonry ingredientFactonry1 = new XianIngredientFactory();
        BeiJingPizza beiJingPizza = new BeiJingPizza((BeiJingIngredientFactory) ingredientFactonry);
        beiJingPizza.make();

    }
}
