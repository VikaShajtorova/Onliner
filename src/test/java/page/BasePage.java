package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;

public abstract class BasePage {
    WebDriver driver;
    public static final String BASE_URL = "https://www.onliner.by/";
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public abstract boolean isPageOpen();

    public boolean isExist(By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }

}
