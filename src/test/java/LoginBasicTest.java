import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginBasicTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/ilonakutuzova/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://cpb-v2-stage-march.myshopify.com/");

        WebElement passwordModal = driver.findElement(By.xpath("//*[@id=\"shopify-section-main-password-header\"]/div/div/password-modal/details/summary/div[1]"));
        passwordModal.click();

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("stage");

        WebElement enterButton = driver.findElement(By.xpath("//*[@id=\"login_form\"]/button"));
        enterButton.click();


    }
}
