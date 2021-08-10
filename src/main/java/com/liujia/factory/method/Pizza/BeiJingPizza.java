package com.liujia.factory.method.Pizza;

import com.liujia.factory.method.Ingredient.Beef;
import com.liujia.factory.method.Ingredient.Maodu;
import com.liujia.factory.method.IngredientFactory.impl.BeiJingIngredientFactory;
import com.liujia.factory.method.Pizza.Pizza;

public  class BeiJingPizza  extends Pizza {
    Maodu maodu;
    BeiJingIngredientFactory beiJingIngredientFactory;
    public BeiJingPizza() {
    }

    public BeiJingPizza(BeiJingIngredientFactory beiJingIngredientFactory) {
        this.beiJingIngredientFactory = beiJingIngredientFactory;
        prepare();
    }

    @Override
    void prepare() {
        beef = beiJingIngredientFactory.createBeef();
        cheese = beiJingIngredientFactory.createCheese();
        garlic = beiJingIngredientFactory.createGarlic();
        maodu = beiJingIngredientFactory.createMaodu();
        tomato = beiJingIngredientFactory.createTomato();

    }

    @Override
    void make() {
        System.out.println(beef.getType() + cheese.getType() + garlic.getType() + maodu.getType() + tomato.getType());
    }
}
