package seleniumPractice;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tables {

	public static void main(String[] args) 
	{
		//launching browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HashMap<String, String>trainer=new HashMap<String, String>();
		driver.get("https://colorlib.com/etc/tb/Table_Fixed_Header/index.html");
		List<WebElement> a=driver.findElements(By.xpath("//div[@class='table100 ver1 m-b-110']//table/tbody/tr/td[position()='5' and text()>'15']/preceding-sibling::td[3]"));
		for(WebElement ele:a)
		{
			String type=ele.getAttribute("innerHTML");
			String trainerName=ele.findElement(By.xpath("./following-sibling::td[2]")).getAttribute("innerHTML");
			if(trainer.containsKey(trainerName))
				trainer.put(trainerName, trainer.get(trainerName)+","+type);
			else
				trainer.put(trainerName, type);
		}
		System.out.println(trainer);
		driver.quit();
				
	}


}
