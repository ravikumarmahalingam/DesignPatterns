package com.abstractFactoryDesignPattern;

public class DBEmpDao implements Dao{
    public void save(){
        System.out.println("Saving the Emp data to DB");
    }
}
