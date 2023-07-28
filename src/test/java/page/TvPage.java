package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TvPage extends BasePage{
public static final By TITLE_PRODUCT_CARD = By.xpath("//span[text()='Телевизоры']");
    String nameTv = "//h1[@class='catalog-masthead__title js-nav-header']";

    public TvPage(WebDriver driver) {
        super(driver);
    }
    public String getNameProduct(){
        return driver.findElement(By.xpath(nameTv)).getText();
    }

    @Override
    public boolean isPageOpen() {
        return isExist(TITLE_PRODUCT_CARD);
    }
}
