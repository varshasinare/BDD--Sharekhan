package com.edusol.pom;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.edusol.base.CommonMethods;
import com.edusol.util.PropertyReader;

public class HomePage extends CommonMethods{
	
	public void homepagecheck()
	{
		System.out.println("Browser is launched successfully and User is on ShareKhane Homepage");
	}
	public void contentCheck(String string)
	{
		String title=driver.getTitle();
		System.out.println("Title is: "+title);
		Assert.assertTrue(title.contains(string));
		
		hardwait(3000);
		WebElement alert_close=driver.findElement(By.xpath(PropertyReader.getPropValue("alert_close_xpath")));
		alert_close.click();
		hardwait(3000);
		List<WebElement> largeMenu= driver.findElements(By.className(PropertyReader.getPropValue("list_className")));
		for(int i=0;i<largeMenu.size();i++)
		{
			System.out.print(largeMenu.get(i).getText()+"  ");
		}
		
		
	}
	
	public void mainMenu()
	{
		
		hardwait(3000);
		WebElement alert_close=driver.findElement(By.xpath(PropertyReader.getPropValue("alert_close_xpath")));
		alert_close.click();
		hardwait(3000);
		
		WebElement menu_click=driver.findElement(By.xpath(PropertyReader.getPropValue("menu_click_xpath")));
		Assert.assertTrue(menu_click.isDisplayed());
		hardwait(2000);
		menu_click.click();
		hardwait(2000);
		getScreenshot("Menu button");
		
	}
	
	public void menuPopUp()
	{
		hardwait(2000);
		WebElement memuPopup;
		waitForClick(driver.findElement(By.id(PropertyReader.getPropValue("menu_pop_up_id"))));
		memuPopup=driver.findElement(By.xpath(PropertyReader.getPropValue("menu_click_xpath")));
		Assert.assertTrue(memuPopup.isDisplayed());
		List<WebElement> menu_list=driver.findElements(By.xpath(PropertyReader.getPropValue("menu_list_xpath")));
		for(int i=0;i<10;i++)
		{
			System.out.println(menu_list.get(i).getText()+" ");
		}
	}
	 
	public void menu_link_hover()
	{
		hardwait(3000);
		WebElement alert_close=driver.findElement(By.xpath(PropertyReader.getPropValue("alert_close_xpath")));
		alert_close.click();
		hardwait(3000);
		
		List<WebElement> mousehover_menu=driver.findElements(By.xpath(PropertyReader.getPropValue("main_menu_xpath")));
		Actions action=new Actions(driver);
     System.out.println(mousehover_menu.size());
    
		for(int i=0;i<mousehover_menu.size();i++)
		{
				action.moveToElement(mousehover_menu.get(i)).perform();
				// System.out.println(mousehover_menu.get(i).getText());
				
				switch(i)
				{
				case 0:
					hardwait(2000);
					getScreenshot("MARKET");
					List<WebElement> market_sum_stat_der=driver.findElements(By.xpath(PropertyReader.getPropValue("marketSum_stat_der_xpath")));
					for(int x=0;x<market_sum_stat_der.size();x++)
					{
						action.moveToElement(market_sum_stat_der.get(x)).perform();
						System.out.println(market_sum_stat_der.get(x).getText());
						hardwait(2000);
					}
					
					break;
				case 1:
					hardwait(2000);
					getScreenshot("NEW_TO_MARKET");
					List<WebElement> newTM_submenu=driver.findElements(By.xpath(PropertyReader.getPropValue("newTM_submenu_xpath")));
					for(int x=0;x<newTM_submenu.size();x++)
					{
						action.moveToElement(newTM_submenu.get(x)).perform();
						System.out.println(newTM_submenu.get(x).getText());
						hardwait(2000);
					}
				
					break;
				case 2:
					hardwait(2000);
					getScreenshot("SUPER_INVESTOR");
					List<WebElement> superInve_submenu=driver.findElements(By.xpath(PropertyReader.getPropValue("superInve_submenu_xpath")));
					for(int x=0;x<superInve_submenu.size();x++)
					{
						action.moveToElement(superInve_submenu.get(x)).perform();
						System.out.println(superInve_submenu.get(x).getText());
						hardwait(2000);
					}
				break;
				case 3:
					hardwait(2000);
					getScreenshot("ACTIVE_TRADER");
					List<WebElement> activeT_submenu=driver.findElements(By.xpath(PropertyReader.getPropValue("activeT_submenu_xpath")));
					for(int x=0;x<activeT_submenu.size();x++)
					{
						action.moveToElement(activeT_submenu.get(x)).perform();
						System.out.println(activeT_submenu.get(x).getText());
						hardwait(2000);
					}
					break;
				case 4:
					hardwait(2000);
					getScreenshot("MUTUAL_FUNDS");
					List<WebElement> mutual_funds_submenu=driver.findElements(By.xpath(PropertyReader.getPropValue("mutual_funds_submenu_xpath")));
					for(int x=0;x<mutual_funds_submenu.size();x++)
					{
						action.moveToElement(mutual_funds_submenu.get(x)).perform();
						System.out.println(mutual_funds_submenu.get(x).getText());
						hardwait(2000);
					}
					break;
				case 5:
					hardwait(2000);
					getScreenshot("RESEARCH");
					List<WebElement> research_submenu=driver.findElements(By.xpath(PropertyReader.getPropValue("research_submenu_xpath")));
					for(int x=0;x<research_submenu.size();x++)
					{
						action.moveToElement(research_submenu.get(x)).perform();
						System.out.println(research_submenu.get(x).getText());
						hardwait(2000);
					}
					break;
				case 6:
					hardwait(2000);
					getScreenshot("EDUCATION_FIRST");
					List<WebElement> edu_submenu=driver.findElements(By.xpath(PropertyReader.getPropValue("edu_submenu_xpath")));
					for(int x=0;x<edu_submenu.size();x++)
					{
						action.moveToElement(edu_submenu.get(x)).perform();
						System.out.println(edu_submenu.get(x).getText());
						hardwait(2000);
					}
					break;
				case 7:
					hardwait(2000);
					getScreenshot("PRODUCTS_AND_SERVICES");
					List<WebElement> productNservice=driver.findElements(By.xpath(PropertyReader.getPropValue("productNservice_submenu")));
					for(int x=0;x<productNservice.size();x++)
					{
						action.moveToElement(productNservice.get(x)).perform();
						System.out.println(productNservice.get(x).getText());
						hardwait(2000);
					}
					break;
				default:
					break;
				
				}
			
			
		}
	}
	
	
}
