package com.yldlsy.test;

/**
 * 导演者角色
 */
public class Director {
    private Builder builder;

    /**
     * 产品构造方法，负责调用各个零件的调用方法
     */

    public void construct(){
        ConcreteBuilder1 builder = new ConcreteBuilder1();
        builder.buildPart1();
        builder.buildPart2();
        builder.retrieveResult();
    }
}
