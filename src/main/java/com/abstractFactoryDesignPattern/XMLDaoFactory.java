package com.abstractFactoryDesignPattern;

public class XMLDaoFactory extends DaoAbstractFactory{

    @Override
    public Dao createDao(String type) {
        Dao dao = null;
        if(type.equalsIgnoreCase("emp")){
            dao = new XmlEmpDao();
        } else if(type.equalsIgnoreCase("dept")){
            dao = new XmlDeptDao();
        }
        return dao;
    }
}
