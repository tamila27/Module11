package com.goit.gojavaonline;

import com.goit.gojavaonline.module3_2.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class EncryptionUtilityTest {
    public static Bouquet bouquet;
    public static String expectedEncryptedFlowersList;

    @BeforeClass
    public static void setUpClass(){
        bouquet = new Bouquet();
        bouquet.addFlower(new Aster(FlowerColor.BLUE));
        bouquet.addFlower(new Tulip(FlowerColor.RED));
        bouquet.addFlower(new Rose(FlowerColor.WHITE));

        expectedEncryptedFlowersList = "\nBouquet contains encrypted flowers: \n| BTUFS      | CMVF       |\n| UVMJQ      | SFE        |\n| SPTF       | XIJUF      |\n";
    }

    @Test
    public void testEncryptFlowersList() throws Exception{
        Assert.assertTrue(expectedEncryptedFlowersList.equals(bouquet.toEncryptedTableString()));
    }
}