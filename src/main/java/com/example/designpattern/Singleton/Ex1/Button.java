package com.example.designpattern.Singleton.Ex1;

public class Button {
    private final String label;

    public Button(String label) {
        this.label = label;
    }

    public void display() {
        String themeColor = Theme.getInstance().getThemeColor();
        System.out.println(
                "Button [" + label + "] displayed in " + themeColor + " theme."
        );
    }
}
