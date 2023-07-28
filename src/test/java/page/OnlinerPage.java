package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlinerPage extends BasePage {
    String MenuOption = "//div[@class='project-navigation__flex']//span[text()='%s']";
    public static final By TITLE_ONLINER = By.xpath("//a[@class='project-navigation__honor']");


    public OnlinerPage(WebDriver driver) {
        super(driver);
    }

    public OnlinerPage open() {
        driver.get(BASE_URL);
        return this;
    }

    public void clickMenuOption(String text) {
        driver.findElement(By.xpath(String.format(MenuOption,text))).click();
    }


    @Override
    public boolean isPageOpen() {
        return isExist(TITLE_ONLINER);
    }
}
