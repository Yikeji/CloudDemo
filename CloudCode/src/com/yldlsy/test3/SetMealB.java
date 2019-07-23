package com.yldlsy.test3;

/**
 * 实现抽象套餐类，ConcreteBuilder角色
 */
public class SetMealB extends  MealBuilder {
    @Override
    public void buildFood() {
        setMeal.setFood("两个汉堡");
    }

    @Override
    public void buildDrink() {
        setMeal.setDrink("一杯柠檬果汁");
    }
}
