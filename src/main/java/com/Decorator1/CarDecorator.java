package com.Decorator1;

public class CarDecorator implements Car{
    public Car car;

    CarDecorator(Car car){
        this.car = car;
    }

    public void make(){
        car.make();
    }
}
