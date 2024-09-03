import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledAndEnabledElements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/ilonakutuzova/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/enabled");

        WebElement disableInput = driver.findElement(By.id("disabledInput"));
        Assert.assertFalse(disableInput.isEnabled());
        System.out.println("Field is disabled");

        WebElement enableInput = driver.findElement(By.id("input"));
        Assert.assertTrue(enableInput.isEnabled());
        System.out.println("Field is enabled");

        enableInput.sendKeys("test");

//        driver.quit();

    }
}
