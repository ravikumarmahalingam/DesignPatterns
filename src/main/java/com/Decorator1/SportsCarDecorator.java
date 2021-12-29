package com.Decorator1;

public class SportsCarDecorator extends CarDecorator{

    SportsCarDecorator(Car car) {
        super(car);
    }

    public void make(){
        super.make();
        System.out.println("Sports features added");
    }
}
