package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Home;
import pages.Login;

import java.time.Duration;

public class BaseClass {
    WebDriver driver;
   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/my/Downloads/chromedriver-linux64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://homecureph1drindranil-203321-react.b203321.dev.eastus.az.svc.builder.cafe/");
    }


    @Test
    public void Continue(){
        Home home=new Home(driver);
        home.login();
    }
    @Test
    public void login(){
        Login login = new Login(driver);
        login.login();
        login.otp();
    }
    //@Test


    @AfterClass
    public void closure(){
        //driver.quit();
    }
}
