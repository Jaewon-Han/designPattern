package com.example.designpattern.Singleton.Ex1;

public class SingletonEx1Main {
    public static void main(String[] args) {
        Button button = new Button("Submit");
        TextField textField = new TextField("Enter your name");
        Label label = new Label("UserName");

        button.display();
        textField.display();
        label.display();

        Theme.getInstance().setThemeColor("dark");

        button.display();
        textField.display();
        label.display();
    }
}
