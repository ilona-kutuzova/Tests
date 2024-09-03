import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompleteWebForm {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ilonakutuzova/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        submitForm(driver);


        Thread.sleep(10000);

        WebElement alert = driver.findElement(By.cssSelector("body > div > div"));
        String alertText = alert.getText();
        assertEquals("The form was successfully submitted!", alertText);



        driver.quit();
    }

    public static void submitForm(WebDriver driver) throws InterruptedException {
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Test");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Test");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Tester");

        WebElement education = driver.findElement(By.id("radio-button-1"));
        education.click();

        WebElement sex = driver.findElement(By.id("checkbox-2"));
        sex.click();

        WebElement experience = driver.findElement(By.cssSelector("#select-menu > option:nth-child(2)"));
        experience.click();

        Thread.sleep(3000);

        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("09/25/2018");
        datePicker.sendKeys(Keys.RETURN);

        WebElement submitButton = driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(15) > a"));
        submitButton.click();

    }
}
