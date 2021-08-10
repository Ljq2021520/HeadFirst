package com.liujia.factory.abstra.productImpl;

import com.liujia.factory.abstra.AbstraFactory;
import com.liujia.factory.abstra.AbstractProduct1;
import com.liujia.factory.abstra.AbstractProduct2;

public class AAbstraFactory1 implements AbstraFactory {
    AProduct1 product1;
    AProduct2 product2;
    AProduct2 product3;


    public void createP1() {
        this.product1 = new AProduct1();
    }

    public void createP2() {
        this.product2 = new AProduct2();
    }

    public void createP3() {
        this.product3 = new AProduct2();
    }
}
