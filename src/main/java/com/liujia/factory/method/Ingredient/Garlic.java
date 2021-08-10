package com.liujia.factory.method.Ingredient;

public class Garlic {
    private String type="蒜头";
    public Garlic() {
    }
    public Garlic(String type) {
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
