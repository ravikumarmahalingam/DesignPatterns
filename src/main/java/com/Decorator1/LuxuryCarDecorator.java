package com.Decorator1;

public class LuxuryCarDecorator extends CarDecorator{

    LuxuryCarDecorator(Car car) {
        super(car);
    }

    public void make(){
        super.make();
        System.out.println("Luxury features added");
    }
}
