package com.abstractFactoryDesignPattern;

public class XmlDeptDao implements Dao{

    @Override
    public void save() {
        System.out.println("Saving the Dept data to xml file");
    }
}
