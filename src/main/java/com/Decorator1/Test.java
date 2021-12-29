package com.Decorator1;

public class Test {

    public static void main(String[] args) {
        Car car = new SportsCarDecorator(new LuxuryCarDecorator(new BasicCar()));
        car.make();
    }
}
