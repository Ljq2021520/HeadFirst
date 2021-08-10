package com.liujia.factory.abstra.Ingredient;

public class Beef {
    private String type="牛肉";

    public Beef() {
    }

    public Beef(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tomato{" +
                "type='" + type + '\'' +
                '}';
    }
}
