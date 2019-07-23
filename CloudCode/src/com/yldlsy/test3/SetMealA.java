package com.yldlsy.test3;

/**
 * 实现抽象套餐类，ConcreteBuilder角色
 */
public class SetMealA extends MealBuilder {
    @Override
    public void buildFood() {
        setMeal.setFood("两根油条");
    }

    @Override
    public void buildDrink() {
        setMeal.setDrink("一碗豆浆");
    }
}
