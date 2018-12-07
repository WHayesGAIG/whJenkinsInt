package whJenkinsInt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		WebElement gglSearchBox = driver.findElement(By.xpath("//input[@name='q']"));
		
		gglSearchBox.sendKeys("testing");
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		driver.close();
	}

}
