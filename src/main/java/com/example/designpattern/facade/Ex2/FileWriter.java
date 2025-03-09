package com.example.designpattern.facade.Ex2;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter {
    public void writFile(String filePath, String content) throws Exception {
        Files.write(Paths.get(filePath), content.getBytes());
    }
}
