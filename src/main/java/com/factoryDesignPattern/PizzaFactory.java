package com.factoryDesignPattern;

public class PizzaFactory {
    public static Pizza createPizza(String type){
        if(type.equalsIgnoreCase("chicken")){
            return new ChickenPizza();
        }else if(type.equalsIgnoreCase("veggie")){
            return new VeggiePizza();
        }else {
            return new CheesePizza();
        }
    }
}
