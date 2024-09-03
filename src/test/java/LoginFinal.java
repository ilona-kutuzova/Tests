import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginFinal extends LoginClass {

    WebDriver driver;

    @Test
    public void test001() {
        LoginClass.login(driver);
    }

}
