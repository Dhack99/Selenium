package SeleniumWaits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class pageLoadTimes {

    WebDriver driver;

    @BeforeMethod
    public void openPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://leafground.com/waits.xhtml");
    }

    @Test
    public void pageLoadTimesTest(){

    }
}
