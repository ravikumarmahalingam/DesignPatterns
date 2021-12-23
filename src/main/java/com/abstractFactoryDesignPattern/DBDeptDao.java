package com.abstractFactoryDesignPattern;

public class DBDeptDao implements Dao{
    public void save(){
        System.out.println("Saving the Dept data to DB");
    }
}
