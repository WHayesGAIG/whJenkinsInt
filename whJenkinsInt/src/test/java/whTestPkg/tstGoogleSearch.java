package whTestPkg;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit.*;

public class tstGoogleSearch {

	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void googleSearch() {

		
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("WH test");
		driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	}
	
	
	@Test
	public void sampleTest0() {
		assertTrue(1 < 2);
	}

	@Test
	public void sampleTest1() {
		assertTrue(1 > 2);
	}

	@Test
	public void sampleTest2() {
		assertTrue(1 < 2);
	}

	@Test
	public void sampleTest4() {
		assertTrue(1 > 2);
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		System.out.println("Whayes. Test Finished");
		
	}
}
