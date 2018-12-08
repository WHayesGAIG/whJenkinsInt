package whTestPkg;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestAllPassAssertions {
	
	@BeforeTest
	public void setUP() {
		System.out.println("In the BeforeTest annotation");
		
	}

	@Test
	public void whTestReport() throws IOException {

		
	}
	
	@Test
	public void sampleTest0() {
		assertTrue(1 < 2);
	}

	@Test
	public void sampleTest1() {
		assertTrue(1 < 2);
	}

	@Test
	public void sampleTest2() {
		assertTrue(1 < 2);
	}

	@Test
	public void sampleTest4() {
		assertTrue(1 < 2);
	}
	
	
	@AfterTest
	public void tearDown() {
		
        // calling flush writes everything to the log file
 
	}

}
