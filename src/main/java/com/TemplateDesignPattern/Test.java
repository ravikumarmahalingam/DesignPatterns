package com.TemplateDesignPattern;

public class Test {

    public static void main(String[] args) {
        DataRenderer dataRenderer = new CSVDataRenderer();
        dataRenderer.render();
        dataRenderer = new XMLDataRenderer();
        dataRenderer.render();
    }
}
