package com.example.designpattern.Strategy.Ex2;

/**
 * 전략 패턴의 알고리즘 (전략도구)
 */
public class SimpleReplacementCompression implements CompressionStrategy {

    @Override
    public String compress(String data) {
        return data.replace("a", "1")
                .replace("e", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("u", "5");
    }
}
