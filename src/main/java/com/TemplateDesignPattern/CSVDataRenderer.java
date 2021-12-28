package com.TemplateDesignPattern;

public class CSVDataRenderer extends DataRenderer {

    @Override
    String processData(String str) {
        return str.concat(" is processed by CSVDataRenderer");
    }

    @Override
    String readData() {
        return "csv data";
    }
}
