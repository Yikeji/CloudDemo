package com.yldlsy.test3;

public class TestMeal {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        //套餐A
        SetMealA a = new SetMealA();
        //服务员准备套餐A
        waiter.setMealBuilder(a);
        //获得套餐
        SetMeal mealA = waiter.construct();

        System.out.print("套餐A的组成部分:");
        System.out.println(mealA.getFood()+"---"+mealA.getDrink());
    }
}
