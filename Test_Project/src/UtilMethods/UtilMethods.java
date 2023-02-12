package UtilMethods;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilMethods {

    public static void waitForVisibility(WebDriver driver, String xpath) {
		new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(xpath)));
	}
    public static void clickByXpath(WebDriver driver, String Xpath)
	{
		driver.findElement(By.xpath(Xpath)).click();
	}
    public static void sendKeysXpath(WebDriver driver, String Xpath, String value)
	{
		WebElement element = driver.findElement(By.xpath(Xpath));
		element.clear();
		element.sendKeys(value);
		
	}
}
