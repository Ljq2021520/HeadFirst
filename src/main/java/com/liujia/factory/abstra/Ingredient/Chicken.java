package com.liujia.factory.abstra.Ingredient;

public class Chicken {
    private String type="鸡排";
    public Chicken() {
    }
    public Chicken(String type) {
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
