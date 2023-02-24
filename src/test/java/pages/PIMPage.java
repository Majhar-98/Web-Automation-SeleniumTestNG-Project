package pages;

import org.json.simple.JSONArray;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.time.Instant;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class PIMPage {
    @FindBy(className = "oxd-button--secondary")
    public List<WebElement> button;
    @FindBy(css = "[name=firstName]")
    public WebElement txtFirstName;
    @FindBy(css = "[name=lastName]")
    public WebElement txtLastName;
    @FindBy(className = "oxd-input")
    public List<WebElement> txtEmployeeId;
    @FindBy(className = "oxd-switch-input")
    public WebElement btnToggle;
    @FindBy(tagName = "input")
    public List<WebElement> txtUserName;
    @FindBy(tagName = "input")
    public List<WebElement> txtPassword;
    @FindBy(tagName = "input")
    public List<WebElement> txtConfirmPassword;
    @FindBy(css = "[type=submit]")
    public WebElement Submit;
    @FindBy(tagName = "input")
    public List<WebElement> txtSearchEmpName;
    @FindBy(tagName = "button")
    public List<WebElement> btnUpdateEmployee;
    @FindBy(className = "oxd-input")
    public List<WebElement> txtUpdateEmployeeId;

    public PIMPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    public void createEmployee(String firstname, String lastname, String employeeId, String username, String password) throws InterruptedException {
        txtFirstName.sendKeys(firstname);
        txtLastName.sendKeys(lastname);

        WebElement empID = txtEmployeeId.get(4);
        Thread.sleep(2000);
        empID.clear();
        empID.sendKeys(Keys.CONTROL + "a");
        empID.sendKeys(employeeId);

        Thread.sleep(1500);
        btnToggle.click();
        txtUserName.get(7).sendKeys(username);
        txtPassword.get(10).sendKeys(password);
        txtConfirmPassword.get(11).sendKeys(password);
        Thread.sleep(1500);
        Submit.click();
        Thread.sleep(3000);

    }

    public void createEmployeeWithoutUsername(String firstname, String lastname, String employeeId, String password) throws InterruptedException {
        txtFirstName.sendKeys(firstname);
        txtLastName.sendKeys(lastname);
        WebElement empID = txtEmployeeId.get(4);
        Thread.sleep(2000);
        empID.clear();
        empID.sendKeys(Keys.CONTROL + "a");
        empID.sendKeys(employeeId);
        Thread.sleep(1500);
        btnToggle.click();
        txtPassword.get(10).sendKeys(password);
        txtConfirmPassword.get(11).sendKeys(password);
        Thread.sleep(1500);
        Submit.click();
        Thread.sleep(3000);
    }

    public void SearchEmployeeByInvalidName(String employeeName) throws InterruptedException {
        txtSearchEmpName.get(1).sendKeys(employeeName);
        Thread.sleep(1500);
        Submit.click();
    }

    public void SearchEmployeeByValidName(String employeeName) throws InterruptedException {
        txtSearchEmpName.get(1).sendKeys(employeeName);
        Thread.sleep(1500);
        Submit.click();
    }
    public void updateEmployeeById(String employeeId) throws InterruptedException {
        Thread.sleep(5000);
        btnUpdateEmployee.get(6).click();
        Thread.sleep(6000);
        txtUpdateEmployeeId.get(5).sendKeys(Keys.CONTROL + "a" + Keys.BACK_SPACE);
        Thread.sleep(1000);
        txtUpdateEmployeeId.get(5).sendKeys(employeeId);
        Thread.sleep(1500);
        btnUpdateEmployee.get(1).click();
    }
    public void SearchEmployeeByValidId(String randomEmployeeId) throws InterruptedException {
        txtEmployeeId.get(1).sendKeys(randomEmployeeId);
        Thread.sleep(1500);
        Submit.click();
    }

}