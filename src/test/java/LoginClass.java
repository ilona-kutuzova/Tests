import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginClass {

    public static void login(WebDriver driver) {

    System.setProperty("webdriver.chrome.driver", "/Users/ilonakutuzova/Downloads/chromedriver-mac-arm64/chromedriver");
    driver = new ChromeDriver();
    driver.get("https://cpb-v2-stage-march.myshopify.com/");

    WebElement passwordModal = driver.findElement(By.xpath("//*[@id=\"shopify-section-main-password-header\"]/div/div/password-modal/details/summary/div[1]"));
    passwordModal.click();

    WebElement passwordField = driver.findElement(By.name("password"));
    passwordField.sendKeys("stage");

    WebElement enterButton = driver.findElement(By.xpath("//*[@id=\"login_form\"]/button"));
    enterButton.click();

    String pageText = driver.getPageSource();
    assertTrue(pageText.contains("Welcome to our store"));
    System.out.println("You successfully logged in");
    }
}
