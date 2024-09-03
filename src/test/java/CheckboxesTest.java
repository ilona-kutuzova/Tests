import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class CheckboxesTest {

WebDriver driver;

@BeforeTest

    public void setUp() {
    System.setProperty("webdriver.chrome.driver", "/Users/ilonakutuzova/Downloads/chromedriver-mac-arm64/chromedriver");
    driver = new ChromeDriver();
}

@Test

    public void test001() {
    driver.get("https://the-internet.herokuapp.com/checkboxes");

    List<WebElement> listOfCheckboxes = driver.findElements(By.tagName("input"));
    int listSize = listOfCheckboxes.size();

    System.out.println("List size: " + listSize);

    for (int i = 0; i < listSize; i++) {
        System.out.println(listOfCheckboxes.get(i));
    }
}

@AfterTest
    public void quit() {
    if (driver != null) {
        driver.quit();
    }
}
}
