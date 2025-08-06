package test;

import Page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;

    @Test
    public void Login(){
        LoginPage page = new LoginPage();
        page.LoginIntoApp();
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }

}
