package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserDetailsPage {
    @FindBy(className = "oxd-main-menu-item")
    public List<WebElement> userMenu;
    @FindBy(className = "oxd-radio-input")
    public List<WebElement> btnRadio;
    @FindBy(className = "oxd-select-text-input")
    public List<WebElement> dropdown;
    @FindBy(className = "orangehrm-tabs-item")
    public List<WebElement> contactDetails;
    @FindBy(className = "oxd-input")
    public List<WebElement> txtInput;
    @FindBy(className = "oxd-select-text-input")
    public WebElement dropdownCountry;
    @FindBy(css = "[type=submit]")
    public List<WebElement> Submit;
    public UserDetailsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
    public void selectGender() throws InterruptedException {

        btnRadio.get(1).click();
        Thread.sleep(2000);
        Submit.get(0).click();
        Thread.sleep(5000);

    }
    public void selectBloodType() throws InterruptedException {
        dropdown.get(2).click();
        dropdown.get(2).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        dropdown.get(2).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        dropdown.get(2).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        Submit.get(1).click();
        Thread.sleep(2000);
    }
    public void selectContact() throws InterruptedException {
        contactDetails.get(1).click();
        Thread.sleep(5000);
        txtInput.get(1).sendKeys("101 Independence Avenue");
        txtInput.get(2).sendKeys("LIBCON");
        txtInput.get(3).sendKeys("Washington");
        txtInput.get(4).sendKeys("DC");
        txtInput.get(5).sendKeys("1450");
        Thread.sleep(2000);
        dropdownCountry.click();
        dropdownCountry.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        dropdownCountry.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        dropdownCountry.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        txtInput.get(7).sendKeys("+12027074");
        txtInput.get(9).sendKeys("user@gmail.com");
        Thread.sleep(3000);
        Submit.get(0).click();
    }
}
