package com.abstractFactoryDesignPattern;

public class DaoFactoryProducer {
    public DaoAbstractFactory createFactories(String type){
        DaoAbstractFactory daoAbstractFactory = null;
        if(type.equalsIgnoreCase("xml")){
            daoAbstractFactory = new XMLDaoFactory();
        }else if(type.equalsIgnoreCase("DB")){
            daoAbstractFactory = new DBDaoFactory();
        }
        return daoAbstractFactory;
    }
}
