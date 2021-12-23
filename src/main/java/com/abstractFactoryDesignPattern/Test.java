package com.abstractFactoryDesignPattern;

public class Test {

    public static void main(String[] args) {
        DaoFactoryProducer daoFactoryProducer = new DaoFactoryProducer();
        daoFactoryProducer.createFactories("db").createDao("dept").save();
    }
}
