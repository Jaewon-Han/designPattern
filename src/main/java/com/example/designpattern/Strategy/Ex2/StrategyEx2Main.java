package com.example.designpattern.Strategy.Ex2;

/**
 * client code
 */
public class StrategyEx2Main {
    public static void main(String[] args) {
        Compressor compressor = new Compressor();
        String data = "aabcccccaaa";

        compressor.setStrategy(new RunLengthEncoding());
        System.out.println(
                "RLE Compression: " + compressor.compress(data)
        );

        compressor.setStrategy(new SimpleReplacementCompression());
        System.out.println(
                "Simple Replacement: " + compressor.compress(data)
        );
    }
}
