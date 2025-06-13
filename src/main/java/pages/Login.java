package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.Random;

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

    @FindBy(xpath = "//span[text()='Done']")
    WebElement done;

    @FindBy(xpath = "//p[text()='Register']")
    WebElement register;

    @FindBy(xpath = "//span[@class='MuiButton-label']")
    WebElement ContinueButton;

    @FindBy(xpath = "//input[contains(@placeholder,'Enter your mail id')]")
    WebElement email;

    @FindBy(xpath = "//span[text()='Continue']")
    WebElement continueButton;

    @FindBy(xpath = "//span[text()='Resend']")
    WebElement resend;

    @FindBy(xpath = "//span[text()='Done']")
    WebElement donee;

    public static String generatePhoneNumber() {
        Random random = new Random();

        int firstDigit = random.nextBoolean() ? 9 : 8;

        StringBuilder phoneNumber = new StringBuilder();
        phoneNumber.append(firstDigit);

        for (int i = 0; i < 9; i++) {
            phoneNumber.append(random.nextInt(10)); // digits 0–9
        }

        return phoneNumber.toString();
    }

   public void registerr(){
    phoneNo.sendKeys(generatePhoneNumber());
    ContinueButton.click();
   }
    // public void login(){
    //     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    //     phoneNo.sendKeys("6261420133");
    //     loginBut.click();
    // }
    public static String generateEmail() {
        Random random = new Random();

        // Random name (choose a few characters randomly)
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            name.append(characters.charAt(random.nextInt(characters.length())));
        }

        // Random number (3 digits)
        int number = 100 + random.nextInt(900); // gives a 3-digit number from 100 to 999

        // Combine to form email
        return name.toString() + number + "@gmail.com";
    }

   
    public void otp(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Method called");
        digit0.sendKeys("1");
        digit1.sendKeys("2");
        digit2.sendKeys("3");
        digit3.sendKeys("4");
        verifyButton.click();
        done.click();
    }
    public void register(){
        register.click();
    }
    public void emailVer(){
        email.sendKeys(generateEmail());
        continueButton.click();
        resend.click();
        donee.click();
    }
}
