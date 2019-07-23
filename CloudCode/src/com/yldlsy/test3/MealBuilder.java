package com.yldlsy.test3;

/**
 * 套餐构造器，Builder角色
 */
public abstract class MealBuilder {
    SetMeal setMeal = new SetMeal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public SetMeal getMeal(){
        return setMeal;
    }
}
