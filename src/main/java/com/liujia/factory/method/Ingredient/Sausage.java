package com.liujia.factory.method.Ingredient;

public class Sausage {
    private String type="腊肠";
    public Sausage() {
    }
    public Sausage(String type) {
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
