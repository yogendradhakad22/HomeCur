package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {
     WebDriver driver;
    WebDriverWait wait;

    public Registration(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//input[@placeholder='Enter your name']")
    WebElement  name;
    @FindBy(xpath = "//input[@placeholder='Enter your address']")
    WebElement  address;
    @FindBy(xpath = "//input[@placeholder='Enter city']")
    WebElement  city;
    @FindBy(xpath = "//input[@placeholder='Enter district']")
    WebElement  district;
    @FindBy(xpath = "//input[@placeholder='6 digit Pin Code']")
    WebElement  pin;
    @FindBy(xpath = "//input[@placeholder='Enter family member name']")
    WebElement  famMem;
    @FindBy(xpath = "//input[@placeholder='Enter family member relation']")
    WebElement  famRel;
    @FindBy(xpath = "//input[@placeholder='Enter phone number']")
    WebElement  phone;
    @FindBy(xpath = "//input[@placeholder='Enter age']")
    WebElement  age;

    @FindBy(xpath = "//div[contains(@class, 'css-1hwfws3')]")
    WebElement genderDropdown;


    // This targets the whole language dropdown div
    @FindBy(xpath = "//div[@data-test-id='paientLanguage']")
    WebElement languageDropdown;

    @FindBy(xpath = "//div[text()='Male']")
    WebElement maleOption;

    @FindBy(xpath = "//*[@id='language']/div/div[2]/div/div/div[2]") 
    WebElement englishOption;

    @FindBy(xpath = "//*[@id=\"language\"]/div/div[2]/div/div/div[1]")
    WebElement hindiOption;

    
    
    @FindBy(xpath = "//div/div[13]/button[@data-test-id='secondary']")
    WebElement submit;

    
    @FindBy(xpath = "//span[text()='Okay']")
   WebElement Okay;

   @FindBy(xpath = "//h6[text()='Register']")
    WebElement register;
    

    public void fillDetail(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        name.sendKeys("Arpit");
        address.sendKeys("Vijay Nagar");
        city.sendKeys("Indore");
        district.sendKeys("Indore");
        pin.sendKeys("452010");
        famMem.sendKeys("Yogendra");
        famRel.sendKeys("Brother");
        age.sendKeys("19");
        phone.sendKeys("9548632145");
        genderDropdown.click();
        maleOption.click();
        languageDropdown.click();
        
        englishOption.click();
        hindiOption.click();
      register.click();
        submit.click();
       Okay.click();

    }

}
