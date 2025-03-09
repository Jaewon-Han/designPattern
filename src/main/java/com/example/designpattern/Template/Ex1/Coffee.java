package com.example.designpattern.Template.Ex1;

public class Coffee extends Beverage {

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");

    }
}
