package com.stepdef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utils.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {

	@Before()
	public void setUp(Scenario sc) {
		getDriver();
		System.out.println(sc.getName());
	}

	@After()
	public void tearDown1(Scenario sc) {
		System.out.println(sc.getStatus());
		if (sc.isFailed()) {
			TakesScreenshot tk=(TakesScreenshot) driver;
			byte[] bs = tk.getScreenshotAs(OutputType.BYTES);
			sc.embed(bs, "failed/png");
		}
		closeBrowser();
	}
}
