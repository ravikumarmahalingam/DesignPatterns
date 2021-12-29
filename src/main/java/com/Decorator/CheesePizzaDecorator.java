package com.Decorator;

public class CheesePizzaDecorator extends PizzaDecorator{

    CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void bake(){
        super.bake();
        System.out.println("Adding cheese toppings");
    }
}