package com.yldlsy.test;

/**
 * 具体建造者Builder类的源码
 */
public class ConcreteBuilder2 extends Builder {

    private Product2 product = new Product2();
    /**
     * 产品零件建造方法
     */
    @Override
    public void buildPart1() {

    }

    /**
     * 产品零件建造方法
     */
    @Override
    public void buildPart2() {

    }
    /**
     * 产品返还方法
     */
    @Override
    public Product retrieveResult() {
        return product;
    }
}
