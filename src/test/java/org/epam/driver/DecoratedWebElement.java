package org.epam.driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class DecoratedWebElement implements WebElement {
	
	protected WebElement webElement;
	
	public DecoratedWebElement(WebElement webElement)
	{
		this.webElement = webElement;
	}

	private void highlightElement(WebDriver driver, WebElement element)
    {
        String bg = element.getCssValue("backgroundColor");
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '" + "yellow" + "'", element);
        js.executeScript("arguments[0].style.backgroundColor = '" + bg + "'", element);
    }
	
	@Override
	public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
		
		return webElement.getScreenshotAs(target);
	}
	
	@Override
	public void sendKeys(CharSequence... chr) {
		highlightElement(SetUpSelenium.getDriver(), this);
		webElement.sendKeys(chr);
	}

	@Override
	public void clear() {
		highlightElement(SetUpSelenium.getDriver(),this);
		webElement.clear();
		
	}

	@Override
	public void click() {
		highlightElement(SetUpSelenium.getDriver(),this);
		webElement.click();
		
	}

	@Override
	public WebElement findElement(By by) {
		return webElement.findElement(by);
	}

	@Override
	public List<WebElement> findElements(By by) {
		
		return webElement.findElements(by);
	}

	@Override
	public String getAttribute(String attribute) {
		return webElement.getAttribute(attribute);
	}

	@Override
	public String getCssValue(String propertyName) {
		
		return webElement.getCssValue(propertyName);
	}

	@Override
	public Point getLocation() {
		
		return webElement.getLocation();
	}

	@Override
	public Rectangle getRect() {
		
		return webElement.getRect();
	}

	@Override
	public Dimension getSize() {
		
		return webElement.getSize();
	}

	@Override
	public String getTagName() {
		
		return webElement.getTagName();
	}

	@Override
	public String getText() {
		
		return webElement.getText();
	}

	@Override
	public boolean isDisplayed() {
		
		return webElement.isDisplayed();
	}

	@Override
	public boolean isEnabled() {
		return webElement.isEnabled();
	}

	@Override
	public boolean isSelected() {
		
		return webElement.isSelected();
	}

	@Override
	public void submit() {
		webElement.submit();
		
	}

}
