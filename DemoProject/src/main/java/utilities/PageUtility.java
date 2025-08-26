package utilities;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectByVisibleText(WebElement element,String visibleText) 
	{
	Select select =new Select(element); 
	select.selectByVisibleText(visibleText);
	}
	public void selectByValue(WebElement element,String value)
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public void selectByIndex(WebElement element,int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public void mouseOver(WebDriver driver,WebElement Element) {
		Actions action=new Actions(driver);
		action.moveToElement(Element).perform();
	}
	public void dragAndDrop(WebDriver driver,WebElement Element)
	{
		Actions action=new Actions(driver);
		action.dragAndDrop(Element, Element).perform();
	}
	public void rightClick(WebDriver driver,WebElement Element) {
		Actions actions=new Actions(driver);
		actions.contextClick().perform();
	}
	public void doubleClick(WebDriver driver,WebElement Element) {
		Actions actions=new Actions(driver);
		actions.doubleClick().perform();
	}
	public void click(WebDriver driver,WebElement Element) {
		Actions actions=new Actions(driver);
		actions.click();
	}
	
	}

	
