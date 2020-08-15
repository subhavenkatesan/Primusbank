package bank.cucumbermap;

import bank.methods.SeleniumOperations;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login 
{
	@When("^user open the \"([^\"]*)\" browser and the \"([^\"]*)\"$")
	public void user_open_the_browser_and_the(String browsername, String exe) throws Throwable 
	{
		//browser launch
				Object[]input=new Object[2];
				input[0]= browsername;
				input[1]= exe;
				SeleniumOperations.browserlaunch(input);
	}

	@When("^user enters url \"([^\"]*)\"$")
	public void user_enters_url(String url) throws Throwable 
	{
		Object[] input1=new Object[1];
		input1[0]=url;
		SeleniumOperations.applicationLaunch(input1);
	}

	@When("^user enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String username) throws Throwable 
	{
		Object[]input3=new Object[2];
		input3[0]= "//*[@id='txtuId']";
		input3[1]= username ;
		SeleniumOperations.sendkeys(input3);
	}

	@When("^user enters \"([^\"]*)\" as passowrd$")
	public void user_enters_as_passowrd(String password) throws Throwable 
	{
		Object[]input4=new Object[2];
		input4[0]= "//*[@type='password']";
		input4[1]= password ;
		SeleniumOperations.sendkeys(input4);
	    
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable 
	{
		Object[]input5=new Object[1];
		input5[0]= "//*[@src='images/login.jpg']";
		SeleniumOperations.click(input5);
	    
	}

	@Then("^user is on the \"([^\"]*)\" main page and get message as Welcome to Admin$")
	public void user_is_on_the_main_page_and_get_message_as_Welcome_to_Admin(String msg) throws Throwable 
	{
		Object[] login=new Object[2];
		 login[0]="//*[text()='Admin']";
		 login[1]="msg";
		 SeleniumOperations.validation(login);

	}


	
}