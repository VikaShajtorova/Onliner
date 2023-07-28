package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.OnlinerPage;
import page.ItemPage;
import page.TvPage;

import java.util.concurrent.TimeUnit;


public class BaseTest {
    WebDriver driver;
    OnlinerPage onlinerPage;
    ItemPage itemPage;
    TvPage tvPage;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        onlinerPage = new OnlinerPage(driver);
        itemPage = new ItemPage(driver);
        tvPage = new TvPage(driver);




    }
    @Step("Закрытие браузера")
    @AfterMethod(alwaysRun = true)
    public void tearDown(){

        driver.quit();
    }

}
