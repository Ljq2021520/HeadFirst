package com.liujia.factory.method.Ingredient;

public class Tomato {
    private String type="西红柿";

    public Tomato() {
    }

    public Tomato(String type) {
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
