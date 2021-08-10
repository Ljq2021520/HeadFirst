package com.liujia.factory.method.Pizza;

import com.liujia.factory.method.Ingredient.LiangPi;
import com.liujia.factory.method.Ingredient.Maodu;
import com.liujia.factory.method.IngredientFactory.impl.BeiJingIngredientFactory;

public  class XiAnPizza extends Pizza {
    LiangPi liangPi;
    BeiJingIngredientFactory beiJingIngredientFactory;
    public XiAnPizza() {
    }

    public XiAnPizza(BeiJingIngredientFactory beiJingIngredientFactory) {
        this.beiJingIngredientFactory = beiJingIngredientFactory;

    }

    @Override
    void prepare() {
        beef = beiJingIngredientFactory.createBeef();
        cheese = beiJingIngredientFactory.createCheese();
        garlic = beiJingIngredientFactory.createGarlic();
        liangPi = beiJingIngredientFactory.createLiangPi();
        tomato = beiJingIngredientFactory.createTomato();

    }

    @Override
    void make() {
        System.out.println(beef.getType() + cheese.getType() + garlic.getType() +liangPi.getType() + tomato.getType());
    }
}
