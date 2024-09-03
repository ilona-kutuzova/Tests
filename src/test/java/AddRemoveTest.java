import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddRemoveTest {


    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/ilonakutuzova/Downloads/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();

    }

    @Test
    public void addRemove() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        addButton.click();

        WebDriverWait waitForDeleteButton = new WebDriverWait(driver, 10);

        WebElement deleteButton = waitForDeleteButton.until(ExpectedConditions.elementToBeClickable(By.className("added-manually")));
        System.out.println("Delete button is here");
        deleteButton.click();
    }

    @AfterTest
    public void quit(){
        if(driver!=null){
            driver.quit();
        }
    }
}
