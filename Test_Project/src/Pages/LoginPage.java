package Pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebElement eCustomerLogin;
    WebElement ecustomerDropdown;
    WebElement eSelectCustomer;
    WebElement elogin;
    String customerLogin = "/html/body/div/div/div[2]/div/div[1]/div[1]/button";
    String customerDropdown = "/html/body/div/div/div[2]/div/form/div/select";
    String selectCustomer = "/html/body/div/div/div[2]/div/form/div/select/option[2]";
    String login = "/html/body/div/div/div[2]/div/form/button";

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void ClickCustomer(){
        eCustomerLogin = (new WebDriverWait(driver,Duration.ofSeconds(4)))
        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(customerLogin)));
        eCustomerLogin.click();
    }
    public void SelectCustomer()
    {
        ecustomerDropdown = (new WebDriverWait(driver,Duration.ofSeconds(4)))
        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(customerDropdown)));
        ecustomerDropdown.click();

        eSelectCustomer = (new WebDriverWait(driver,Duration.ofSeconds(4)))
        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectCustomer)));
        eSelectCustomer.click();
    }

    public void Login()
    {
        elogin = (new WebDriverWait(driver,Duration.ofSeconds(4)))
        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(login)));
        elogin.click();
    }

}
