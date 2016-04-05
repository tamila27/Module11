package com.goit.gojavaonline;

import java.io.FileNotFoundException;

public class FileEncryptionRunner {
    public static void main(String[] args) throws FileNotFoundException {
        encryptFileContent("fileForReading.txt", "fileForWritting.txt");
    }

    public static void encryptFileContent(String fromFileName, String toFileName) throws FileNotFoundException {
        String text = FileManager.readFromFile(fromFileName);
        System.out.println(text);
        FileManager.writeToFile(toFileName, EncryptionUtility.encryptString(text).toString());
    }

}
