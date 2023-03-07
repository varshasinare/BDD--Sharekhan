package com.edusol.stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.edusol.base.CommonMethods;
import com.edusol.util.PropertyReader;

public class CucumberHooks extends CommonMethods{
	
@Before
public void StartUp ()
{
	browserLauch(PropertyReader.getPropValue("browser"));
	driver.get(PropertyReader.getPropValue("url"));
	
	}
@After
public void tearDown()
{
	driver.quit();
	}
}
