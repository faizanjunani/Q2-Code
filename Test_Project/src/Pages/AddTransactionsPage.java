package Pages;
import org.openqa.selenium.WebDriver;
import UtilMethods.UtilMethods;


public class AddTransactionsPage extends UtilMethods {
    WebDriver driver;
    String accountNumberDropdown = "/html/body/div/div/div[2]/div/div[1]/select";
    String accountNumber = "/html/body/div/div/div[2]/div/div[1]/select/option[3]";
    String deposit = "/html/body/div/div/div[2]/div/div[3]/button[2]";
    String withdraw = "/html/body/div/div/div[2]/div/div[3]/button[3]";
    String amount = "/html/body/div/div/div[2]/div/div[4]/div/form/div/input";
    String performTransaction = "/html/body/div/div/div[2]/div/div[4]/div/form/button";
    
    public AddTransactionsPage(WebDriver driver)
    {
        this.driver = driver;
    }
    
         
    public void SelectAccountNumber()
    {
        UtilMethods.waitForVisibility(driver, accountNumberDropdown);
        UtilMethods.clickByXpath(driver, accountNumberDropdown);
        UtilMethods.waitForVisibility(driver, accountNumber);
        UtilMethods.clickByXpath(driver, accountNumber);
    }
    public void CreditTransaction (String Amount) throws InterruptedException
    {
        UtilMethods.waitForVisibility(driver, deposit);
        UtilMethods.clickByXpath(driver, deposit);
        System.out.println("Deposit Clicked");
        Thread.sleep(1500);
        UtilMethods.waitForVisibility(driver, amount);
        UtilMethods.sendKeysXpath(driver, amount, Amount);
        System.out.println("amount entered");
        Thread.sleep(1500);
        UtilMethods.waitForVisibility(driver, performTransaction);
        UtilMethods.clickByXpath(driver, performTransaction);
    }
    public void DebitTransaction (String Amount) throws InterruptedException
    {
        UtilMethods.waitForVisibility(driver, withdraw);
        UtilMethods.clickByXpath(driver, withdraw);
        System.out.println("Withdraw Clicked");
        Thread.sleep(1500);
        UtilMethods.waitForVisibility(driver, amount);
        UtilMethods.sendKeysXpath(driver, amount, Amount);
        System.out.println("amount withdrawn");
        Thread.sleep(1500);
        UtilMethods.waitForVisibility(driver, performTransaction);
        UtilMethods.clickByXpath(driver, performTransaction);
    }

}
