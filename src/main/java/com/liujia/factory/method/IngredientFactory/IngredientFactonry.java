package com.liujia.factory.method.IngredientFactory;

import com.liujia.factory.method.Ingredient.*;

public interface IngredientFactonry {
    public Beef createBeef();
    public Cheese createCheese();
    public Garlic createGarlic();
    public Sausage createSausage();
    public Tomato createTomato();
}
