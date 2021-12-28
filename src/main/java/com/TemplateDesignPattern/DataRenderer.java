package com.TemplateDesignPattern;

public abstract class DataRenderer {
    public void render(){
        String str = readData();
        String output = processData(str);
        System.out.println("Value of the processed data:::" + output);
    }

    abstract String processData(String str);

    abstract String readData();
}
