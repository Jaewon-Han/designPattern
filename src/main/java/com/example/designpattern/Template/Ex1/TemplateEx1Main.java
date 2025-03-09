package com.example.designpattern.Template.Ex1;

public class TemplateEx1Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        Beverage coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.PrepareRecipe();

        System.out.println("\nMaking coffee");
        coffee.PrepareRecipe();
    }
}
