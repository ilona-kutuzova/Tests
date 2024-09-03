import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoogleReusableMethodsTest {

    WebDriver driver;

    @BeforeTest

    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/ilonakutuzova/Downloads/chromedriver-mac-arm64/chromedriver");
        this.driver = new ChromeDriver();
    }

    @Test

    public void test001() throws InterruptedException {

        driver.get("https://www.google.com/");
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("selenium");
        searchField.submit();

//        Thread.sleep(3000);

        WebElement heading = driver.findElement(By.xpath("//*[@id=\"_JvOeZrd1meym1A_E7JawCw_40\"]/div[1]/div/div/div[1]"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(heading));

        String pageText = driver.getPageSource();
        assertTrue(pageText.contains("Selenium"));
        System.out.println("We found Selenium info");
    }

    @AfterTest

    public void quit() {
        if(driver != null) {
            driver.quit();
        }
    }
}
