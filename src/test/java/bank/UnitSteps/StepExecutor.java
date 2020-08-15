package bank.UnitSteps;

import bank.methods.SeleniumOperations;

public class StepExecutor 
{
	public static void main(String[] args) 
	{
		//browser launch
		Object[]input=new Object[2];
		input[0]= "chrome";
		input[1]= "C:\\Selenium -Banking\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
		SeleniumOperations.browserlaunch(input);
		//open url
		Object[] input1=new Object[1];
		input1[0]="http://primusbank.qedgetech.com/";
		SeleniumOperations.applicationLaunch(input1);
		
		//UN										//Sendkeys
		Object[]input3=new Object[2];
		input3[0]= "//*[@id='txtuId']";
		input3[1]= "Admin";
		SeleniumOperations.sendkeys(input3);
		//Password
		Object[]input4=new Object[2];
		input4[0]= "//*[@type='password']";
		input4[1]= "Admin";
		SeleniumOperations.sendkeys(input4);
	
		//Click login
		Object[]input5=new Object[1];
		input5[0]= "//*[@src='images/login.jpg']";
		SeleniumOperations.click(input5);
		//Validatiion
		Object[] login=new Object[2];
		 login[0]="//*[text()='Admin']";
		 login[1]="Admin";
		 SeleniumOperations.validation(login);

		//click branches
		Object[]input6=new Object[1];
		input6[0]= "//*[@src='images/Branches_but.jpg']";
		SeleniumOperations.click(input6);
		
		//static dropdown selection
		
		//country
		Object[]input7=new Object[2];
		input7[0]= "//*[@name='lst_countryS']";
		input7[1]= "INDIA";
		SeleniumOperations.dropdown(input7);
		//State
		Object[]input8=new Object[2];
		input8[0]= "//*[@name='lst_stateS']";
		input8[1]= "Tamil Nadu";
		SeleniumOperations.dropdown(input8);
		//city
		Object[]input9=new Object[2];
		input9[0]= "//*[@name='lst_cityS']";
		input9[1]= "CHENNAI";
		SeleniumOperations.dropdown(input9);
		//click
		Object[]input10=new Object[1];
		input10[0]="//*[@src='images/search2.jpg']";
		SeleniumOperations.click(input10);
		
		// validation search
		 Object[] search=new Object[2];
		 search[0]="(//*[text()='CHENNAI'])[1]";
		 search[1]="CHENNAI";
		 SeleniumOperations.validation(search);
		
	}

}
