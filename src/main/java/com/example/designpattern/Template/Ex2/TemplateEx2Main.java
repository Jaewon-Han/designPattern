package com.example.designpattern.Template.Ex2;

import javax.xml.crypto.Data;

public class TemplateEx2Main {
    public static void main(String[] args) {
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.process("CSV data");

        System.out.println();

        DataProcessor jsonProcessor = new JSONDataProcessor();
        jsonProcessor.process("JSON data");
    }
}
