package bank.cucumbermap;

import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search 
{
	@When("^the user click on branches$")
	public void the_user_click_on_branches() throws Throwable 
	{
		Object[]input6=new Object[1];
		input6[0]= "//*[@src='images/Branches_but.jpg']";
		SeleniumOperations.click(input6);
	    
	}
	@When("^the user select country dropdown as \"([^\"]*)\"$")
	public void the_user_select_country_dropdown_as(String country) throws Throwable 
	{
		Object[]input7=new Object[2];
		input7[0]= "//*[@name='lst_countryS']";
		input7[1]= country;
		SeleniumOperations.dropdown(input7);
	}

	@When("^the user select State dropdown as \"([^\"]*)\"$")
	public void the_user_select_State_dropdown_as(String state) throws Throwable 
	{
		Object[]input8=new Object[2];
		input8[0]= "//*[@name='lst_stateS']";
		input8[1]= state;
		SeleniumOperations.dropdown(input8);
	}

	@When("^the user select city dropddown as \"([^\"]*)\"$")
	public void the_user_select_city_dropddown_as(String city) throws Throwable 
	{
		Object[]input9=new Object[2];
		input9[0]= "//*[@name='lst_cityS']";
		input9[1]= city;
		SeleniumOperations.dropdown(input9);
	}

	@When("^the user click search button$")
	public void the_user_click_search_button() throws Throwable 
	{
		Object[]input10=new Object[1];
		input10[0]="//*[@src='images/search2.jpg']";
		SeleniumOperations.click(input10);
	}

	@Then("^the application shows the result for \"([^\"]*)\" city$")
	public void the_application_shows_the_result_for_city(String results) throws Throwable 
	{
		Object[] search=new Object[2];
		 search[0]="(//*[text()='CHENNAI'])[1]";
		 search[1]=results;
		 SeleniumOperations.validation(search);
	}
	


}
