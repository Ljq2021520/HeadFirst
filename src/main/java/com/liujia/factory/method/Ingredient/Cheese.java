package com.liujia.factory.method.Ingredient;

public class Cheese {
    private String type="奶酪";

    public Cheese() {
    }

    public Cheese(String type) {
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
