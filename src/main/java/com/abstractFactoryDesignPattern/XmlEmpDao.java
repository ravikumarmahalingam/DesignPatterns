package com.abstractFactoryDesignPattern;

public class XmlEmpDao implements Dao{

    @Override
    public void save() {
        System.out.println("Saving the Emp data to xml file");
    }
}
