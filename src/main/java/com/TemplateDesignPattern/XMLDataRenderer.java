package com.TemplateDesignPattern;

public class XMLDataRenderer extends DataRenderer{

    @Override
    String processData(String str) {
        return str.concat(" is processed by XMLDataRenderer");
    }

    @Override
    String readData() {
        return "xml data";
    }
}
