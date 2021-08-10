package com.liujia.factory.method.Ingredient;

public class LiangPi {
    private String type="凉皮";

    public LiangPi() {
    }

    public LiangPi(String type) {
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
