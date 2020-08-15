package bank.UnitSteps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TemptJava implements Temptdata

{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium -Banking\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElementByXPath("//*[@id='txtuId']").sendKeys(userName);
		driver.findElementByXPath("//*[@type='password']").sendKeys(password);
		driver.findElementByXPath("//*[@src='images/login.jpg']").click();
		driver.findElementByXPath("//*[@src='images/Branches_but.jpg']").click();
		Select sel=new Select(driver.findElementByXPath("//*[@name='lst_countryS']"));
		sel.selectByVisibleText(Country);
		
		Select sel1=new Select(driver.findElementByXPath("//*[@name='lst_stateS']"));
		sel1.selectByVisibleText(State);
		Select sel2=new Select(driver.findElementByXPath("//*[@name='lst_cityS']"));
		sel2.selectByVisibleText(City);
		driver.findElementByXPath("//*[@src='images/search2.jpg']").click();
		
	}

}
