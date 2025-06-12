package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Home {
    WebDriver driver;
    WebDriverWait wait;
    public Home(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//span[text()='Patient']")
    WebElement patient;

    @FindBy(xpath = "//span[text()='Hospital']")
    WebElement hospital;

    @FindBy(xpath = "//span[text()='Healthcare Personnel']")
    WebElement personalHealthcare;

    @FindBy(xpath = "//*[@id='root']/div/div[1]/div/div[1]/div/button[4]/span[1]")
    WebElement continuee;

//    public void pressPatient(){
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        patient.click();
//        hospital.click();
//        personalHealthcare.click();
//    }
    public void login(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        patient.click();
        continuee.click();

    }
}
