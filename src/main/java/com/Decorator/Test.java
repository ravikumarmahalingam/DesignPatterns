package com.Decorator;

public class Test {

    public static void main(String[] args) {
        Pizza pizza = new VeggiePizzaDecorator(new CheesePizzaDecorator(new NormalPizza()));
        pizza.bake();
    }
}