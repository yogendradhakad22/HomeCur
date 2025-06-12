package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {
    WebDriver driver;
    WebDriverWait wait;

    public Login(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//input[@placeholder='Enter your phone number']")
    WebElement  phoneNo;

    @FindBy(xpath = "//span[text()='Log in']")
    WebElement loginBut;

    @FindBy(xpath = "//input[@id='otpInput0']")
    WebElement digit0;

    @FindBy(xpath = "//input[@id='otpInput1']")
    WebElement digit1;

    @FindBy(xpath = "//input[@id='otpInput2']")
    WebElement digit2;

    @FindBy(xpath = "//input[@id='otpInput3']")
    WebElement digit3;

    @FindBy(xpath = "//span[text()='Verify']")
    WebElement verifyButton;

    public void login(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        phoneNo.sendKeys("6261420133");
        loginBut.click();
    }

    public void otp(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Method called");
        digit0.sendKeys("1");
        digit1.sendKeys("2");
        digit2.sendKeys("3");
        digit3.sendKeys("4");

        verifyButton.click();
    }
}
