package testrunner;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import setup.Setup;
import utils.Utils;

import java.io.IOException;
import java.text.ParseException;

public class LoginTestRunnerNG extends Setup {
    LoginPage loginPage;

    @Test(priority = 1, description = "user cannot login if provides invalid creds")
    public void doLoginWithInvalidCreds() {
        loginPage = new LoginPage(driver);
        String message_actual = loginPage.doLoginWithInvalidCreds("admin", "wrong password");
        String message_expected = "Invalid credentials";
        Assert.assertTrue(message_actual.contains(message_expected));

    }

    @Test(priority = 2, description = "User can do login successfully if provides valid creds")
    public void doLogin() throws IOException, ParseException, org.json.simple.parser.ParseException {
        loginPage = new LoginPage(driver);
        String username, password;
        JSONObject userObject = Utils.loadJSONFile("./src/test/resources/UserInformation.json");
        if (System.getProperty("username") != null && System.getProperty("password") != null) {
            username = System.getProperty("username");
            password = System.getProperty("password");
        } else {
            username = (String) userObject.get("username");
            password = (String) userObject.get("password");
        }
        //loginPage.doLogin("Admin","admin123");
        loginPage.doLogin(username, password);
        WebElement headerText = driver.findElement(By.tagName("h6"));
        String header_actual = headerText.getText();
        String header_expected = "Dashboard";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(header_actual, header_expected);
        WebElement profileImageElement = driver.findElement(By.className("oxd-userdropdown-img"));
        softAssert.assertTrue(profileImageElement.isDisplayed());
        softAssert.assertAll();


    }
}
