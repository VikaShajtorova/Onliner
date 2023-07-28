package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ItemPage extends BasePage {

    public static final By TV_TITLE = By.xpath("//h1[text()='Телевизоры']");

    public String getNameProductFromList(){
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='schema-product__title']"));
        return list.get(0).getText();
    }
    public void clickNameProductFromList(){
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='schema-product__title']"));
        list.get(0).click();
    }

    public ItemPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(TV_TITLE);
    }
}
