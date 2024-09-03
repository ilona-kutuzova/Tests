import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShopAllTest extends LoginClass{

    WebDriver driver;

//    @BeforeTest
//    public void setUp(){
//        System.setProperty("webdriver.chrome.driver", "/Users/ilonakutuzova/Downloads/chromedriver-mac-arm64/chromedriver");
//        driver = new ChromeDriver();
//    }

    @Test
    public void test001() {
        LoginClass.login(driver);
        testingShopAllFunc();
//        validation();
    }

    public void testingShopAllFunc() {
//        LoginClass.login(driver);
        WebElement shopAllButton = driver.findElement(By.xpath("//*[@id=\"Banner-template--14669427834957__image_banner\"]/div[2]/div/div[2]/a"));
        shopAllButton.click();
    }

    @AfterTest
    public void quit() {
        if (driver != null) {
            driver.quit();
        }
    }
}
