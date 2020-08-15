package bank.cucumbermap;

import cucumber.api.java.Before;
import cucumber.api.java.After;

import cucumber.api.Scenario;

public class Hookable 
{
	@Before
	public void Before(Scenario Scenario )

	{
		System.out.println("...............Scenario Start...............");
	}
	@After
	public void After(Scenario Scenario )

	{
		System.out.println("...............Scenario End...............");
	}

}
