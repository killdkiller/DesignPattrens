package org.epam.driver;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DecoratedDriver implements WebDriver {

	protected WebDriver driver;
	
	public DecoratedDriver(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@Override
	public WebElement findElement(By by) {
		 System.out.println("Looking for element with locator: " + by.toString());
		 return new DecoratedWebElement(driver.findElement(by));
	}

	@Override
	public List<WebElement> findElements(By by) {
//		System.out.println("Looking for List of element with locator: " + by.toString());
		return driver.findElements(by);
	}


	@Override
	public void get(String url) {
		driver.get(url);
		
	}


	@Override
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}


	@Override
	public String getTitle() {
		
		return driver.getTitle();
	}


	@Override
	public String getPageSource() {
		return driver.getPageSource();
	}


	@Override
	public void close() {
		driver.close();
		
	}


	@Override
	public void quit() {
		driver.quit();
		
	}


	@Override
	public Set<String> getWindowHandles() {
		return driver.getWindowHandles();
	}


	@Override
	public String getWindowHandle() {
		
		return driver.getWindowHandle();
	}


	@Override
	public TargetLocator switchTo() {
		
		return driver.switchTo();
	}


	@Override
	public Navigation navigate() {
		
		return driver.navigate();
	}


	@Override
	public Options manage() {
		
		return driver.manage();
	}

}
