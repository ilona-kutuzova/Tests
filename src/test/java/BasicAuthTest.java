import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAuthTest {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/ilonakutuzova/Downloads/chromedriver-mac-arm64/chromedriver");
        this.driver = new ChromeDriver();

    }

    @Test
    public void basicAuth() {
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        if(driver.getPageSource().contains("Congratulations! You must have the proper credentials.")) {
            System.out.println("You are on the authorized page");
        } else {
            System.out.println("Access denied. Wrong credentials");
        }

    }

    @AfterTest
    public void quit(){
        if (this.driver != null) {
            this.driver.quit();
        }
    }
}
