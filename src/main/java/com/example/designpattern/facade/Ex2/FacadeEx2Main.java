package com.example.designpattern.facade.Ex2;

/**
 * 실행 클라이언트
 */
public class FacadeEx2Main {
    public static void main(String[] args) {
        FileSystemFacade fs = new FileSystemFacade();

        //Write to file
        boolean writeSuccess = fs.writeFile(
                "test.txt", "Hello, Facade Pattern!"
        );

        System.out.println("File Write Success " + writeSuccess);

        //Read to file
        String content = fs.readFile("test.txt");
        System.out.println("File content:" + content);

        //Delete file
        boolean deleteSuccess = fs.deleteFile("tet.txt");
        System.out.println("File delete success : " + deleteSuccess);
    }
}
