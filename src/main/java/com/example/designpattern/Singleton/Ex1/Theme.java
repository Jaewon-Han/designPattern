package com.example.designpattern.Singleton.Ex1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Theme {
    private static Theme instance;
    private String themeColor;

    private Theme() {
        this.themeColor = "light"; //Default Theme
    }

    public static Theme getInstance() {
        if (instance == null) {
            instance = new Theme();
        }
        return instance;
    }

}
