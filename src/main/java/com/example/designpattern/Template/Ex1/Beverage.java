package com.example.designpattern.Template.Ex1;

abstract class Beverage {
    //Template method
    final void PrepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();

    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void brew();
    abstract void addCondiments();

}
