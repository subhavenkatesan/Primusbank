package bank.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations 
{
	public static WebDriver driver=null;
	//browser launch
	public static void browserlaunch(Object[] inputParameters)
	{
		String browsername=(String) inputParameters[0];
		String webdriverexepath=(String) inputParameters[1];
		if(browsername.equalsIgnoreCase("Chrome"))
				{
			      System.setProperty("webdriver.chrome.driver",webdriverexepath);
			      driver=new ChromeDriver();
				  driver.manage().window().maximize();
				}
		else if(browsername.equalsIgnoreCase("FF"))
		{
			System.setProperty("webdriver.gecko.driver",webdriverexepath);
		      driver=new FirefoxDriver();
			  driver.manage().window().maximize();
		}
	}
		public static void applicationLaunch(Object[] inputParameters)
		{
			String strgURL=(String)inputParameters[0];
			driver.get(strgURL);
		}
		
		public static void sendkeys(Object[]inputParameters)
		{
			String xpath= (String)inputParameters[0];
			String value=(String)inputParameters[1];
			WebElement a=driver.findElement(By.xpath(xpath));
			a.clear();
			a.sendKeys(value);
		}
		
		public static void click(Object[]inputParameters)
		{
			String xpath=(String)inputParameters[0];
			WebElement a=driver.findElement(By.xpath(xpath));
			a.click();
		}
		public static void dropdown(Object[]inputParameters)
		{
			String xpath=(String)inputParameters[0];
			String name=(String)inputParameters[1];
			Select sel=new Select(driver.findElement(By.xpath(xpath)));
			sel.selectByVisibleText(name);;
		}
		
		public static void validation(Object[]inputParameters)
		{
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			String xpath=(String)inputParameters[0];// we are giving xpath of webelement 
			String String1=(String)inputParameters[1]; // we r giving  String of that xpath 
			
			 WebElement web=driver.findElement(By.xpath(xpath));
			 
			String String2= web.getText();
			
				try 
				{	
				     if(String1.equalsIgnoreCase(String2))
					{
		
		                 System.out.println("Test Case PASS");
					} 
				     
				     
				     else 
					{
				    	
					     System.out.println("Test case fail FAIL");
					}  
				       
				}
				catch (Exception e)
				{	  
				   System.out.println(e);   
					
				}	
		}
	
	}
