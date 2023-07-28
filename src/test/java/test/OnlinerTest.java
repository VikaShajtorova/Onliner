package test;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class OnlinerTest extends BaseTest{
    @Test
    public void openTV(){
        onlinerPage.open();
        onlinerPage.clickMenuOption("Телевизоры");
        String itemName = itemPage.getNameProductFromList();
        itemPage.clickNameProductFromList();



        assertEquals(itemName,tvPage.getNameProduct());

    }


}
