package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
@Test
public void loginTest()
{
	driver.get(baseURL);
	logger.info("URL opened");
	LoginPage lp = new LoginPage(driver);
	lp.setUsername(username);
	logger.info("Entered username");
	lp.setPassword(password);
	logger.info("Entered password");
	lp.click_submit();
	
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		 Assert.assertTrue(true);
		 logger.info("Login test passed");
	}
	else
	{
		Assert.assertTrue(false);
		logger.info("Login failed");
	}
	}
	
}

