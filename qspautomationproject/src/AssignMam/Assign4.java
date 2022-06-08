package AssignMam;



	
		import java.util.Scanner;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;

		public class Assign4 {
			                     WebDriver driver;
			public static void main(String[] args) {
				
				Scanner s =new Scanner(System.in);
				System.out.println("Enter the browser which you want to open");
				String browserv=s.nextLine();
				
				if(browserv.equalsIgnoreCase("chrome"))
				{
					System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://www.Ebay.com");
				}
				else if(browserv.equalsIgnoreCase("firefox"))
				{
					System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
					WebDriver driver=new FirefoxDriver();
					driver.manage().window().maximize();
					driver.get("https://www.Ebay.com");
				}
				else
				{
					System.out.println("enter valid browser name");
				}
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.Ebay.com");
			    driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("apple watches");
			    driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
			    driver.findElement(By.xpath("//li[@class='s-item s-item__pl-on-bottom s-item--watch-at-corner']"));
			    
		 
			}

	}


