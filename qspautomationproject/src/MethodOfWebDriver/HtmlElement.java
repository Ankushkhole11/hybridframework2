package MethodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ask97/Downloads/Microsoft.SkypeApp_kzf8qxf38zg5c!App/All/textbox.html");
		driver.findElement(By.tagName("input")).sendKeys("Dnyanu");
		
		

	}

}
