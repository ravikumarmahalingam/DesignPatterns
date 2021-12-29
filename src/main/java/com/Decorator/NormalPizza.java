package com.Decorator;

public class NormalPizza implements Pizza{

    @Override
    public void bake() {
        System.out.println("baking normal pizza");
    }
}
