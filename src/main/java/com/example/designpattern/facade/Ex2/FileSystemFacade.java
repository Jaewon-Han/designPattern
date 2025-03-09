package com.example.designpattern.facade.Ex2;

import java.io.IOException;

/**
 *  Facade 역할의 클래스 (하나의 창구)
 *  이 클래스를 통해 서비스를 이용함
 */
public class FileSystemFacade {
    private final FileReader fileReader;
    private final FileWriter fileWriter;
    private final FileDeleter fileDeleter;

    public FileSystemFacade() {
        this.fileReader = new FileReader();
        this.fileWriter = new FileWriter();
        this.fileDeleter = new FileDeleter();
    }

    public String readFile(String filePath) {
        try {
            return fileReader.readFile(filePath);
        } catch (Exception e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return null;
    }

    public boolean writeFile(String filePath, String content) {
        try {
            fileWriter.writFile(filePath, content);
            return true;
        } catch (Exception e) {
            System.err.println("Error writing file: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteFile(String filePath) {
        try {
            fileDeleter.deleteFile(filePath);
            return true;
        } catch (Exception e) {
            System.err.println("Error deleting file: " + e.getMessage());
            return false;
        }
    }
}
