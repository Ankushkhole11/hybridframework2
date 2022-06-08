package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cricbuzz.com");
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		

	}

}
