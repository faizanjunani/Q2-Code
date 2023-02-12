package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Pages.*;

public class Test {
       
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/FaizanJunani/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        LoginPage lp = new LoginPage(driver);
        AddTransactionsPage atp = new AddTransactionsPage(driver);
      
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        System.out.println("URL EXECUTED");
        System.out.println("wait 3seconds");
        Thread.sleep(3000);
        lp.ClickCustomer();
        lp.SelectCustomer();
        lp.Login();
        System.out.println("Login Clicked");
       atp.SelectAccountNumber();
       atp.CreditTransaction("50000");
       System.out.println("50000 deposit");
       atp.DebitTransaction("3000");
       System.out.println("3000 withdraw");
       atp.DebitTransaction("2000");
       System.out.println("2000 withdraw");
       atp.CreditTransaction("5000");
       System.out.println("5000 deposit");
       atp.DebitTransaction("10000");
       System.out.println("10000 withdraw");
       atp.DebitTransaction("15000");
       System.out.println("15000 withdraw");
       atp.CreditTransaction("1500");
       System.out.println("1500 deposit");


    }
}

