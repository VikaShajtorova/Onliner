package test;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class OnlinerTest extends BaseTest{
    @Test
    public void openTV(){
        onlinerPage.open();
        onlinerPage.clickMenuOption("Телевизоры");
        itemPage.getNameProductFromList();
        itemPage.clickNameProductFromList();


        assertEquals(itemPage.getNameProductFromList(),tvPage.getNameProduct());

    }


}
