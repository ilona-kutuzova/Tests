import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DigestAuth {

    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "/Users/ilonakutuzova/Downloads/chromedriver-mac-arm64/chromedriver");
        this.driver = new ChromeDriver();
    }

    @DataProvider(name = "dataForAuthTest")
    public Object[][] dataForTest(){
        return new Object[][]{
                {"admin", "admin"},
                {"fads", "huu"},
                {"admin", "uugu"},
                {"uduh", "admin"}
        };
    }

    @Test(dataProvider = "dataForAuthTest")
    public void test(String credential1, String credential2) {
        String login = credential1;
        String password = credential2;

        openAuthPage(login, password);
        assertThatAuthenticated();

    }

    public void openAuthPage(String login, String password) {
        String url = "https://" + login + ":" + password + "@" + "the-internet.herokuapp.com/digest_auth";
        driver.get(url);
    }

    public void assertThatAuthenticated() {
        if(driver.getPageSource().contains("Congratulations! You must have the proper credentials")) {
            System.out.println("Congratulations! You must have the proper credentials");
        } else {
            System.out.println("You are NOT authenticated");
        }
    }

    @AfterTest
    public void quit() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }
}
