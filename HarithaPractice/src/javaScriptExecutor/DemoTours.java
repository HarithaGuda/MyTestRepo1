package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTours {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		WebElement ele = driver.findElement(By.xpath("//input[@name='userName']"));
		JavascriptExecutor jdriver =(JavascriptExecutor)driver;
		jdriver.executeScript("arguments[0].value='mercury'",ele);
		WebElement pas = driver.findElement(By.xpath("//input[@name='password']"));
		jdriver.executeScript("arguments[0].value='mercury'",pas);
		WebElement sub = driver.findElement(By.xpath("//input[@name='submit']"));
		jdriver.executeScript("arguments[0].click();",sub);
		String title=(String) jdriver.executeScript("return document.title");
		System.out.println(title);

	}

}
