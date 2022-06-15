package takesScreenshotDynamically;


public class BaseTest 
{
	static WebDriver driver;
    
	public static void initialization()
	{
		

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
	
		
	}

}
