package com.example.designpattern.facade.Ex2;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDeleter {
    public void deleteFile(String filePath) throws Exception {
        Files.delete(Paths.get(filePath));
    }
}
