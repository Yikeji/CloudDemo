package com.yldlsy.test;

/**
 * 抽象建造者Builder类的源码
 */
abstract public class Builder {
    /**
     * 产品零件建造方法
     */
    public abstract void buildPart1();

    /**
     * 产品零件建造方法
     */
    public abstract void buildPart2();

    /**
     * 产品返还方法
     */
    public abstract Product retrieveResult();
}
