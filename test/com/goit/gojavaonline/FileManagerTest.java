package com.goit.gojavaonline;

import org.junit.Assert;
import org.junit.Test;

public class FileManagerTest {
    @Test
    public void testEncryptToFile() throws Exception{
        String stringFromFile = FileManager.readFromFile("fileForReading.txt");
        FileManager.writeToFile("fileForWritting.txt", EncryptionUtility.encryptString(stringFromFile).toString());
        String decryptedString = EncryptionUtility.decryptString(FileManager.readFromFile("fileForWritting.txt")).toString();
        Assert.assertTrue(decryptedString.equals(stringFromFile));
    }
}