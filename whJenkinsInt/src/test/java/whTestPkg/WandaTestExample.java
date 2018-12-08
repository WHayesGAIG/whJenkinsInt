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

public class WandaTestExample {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	@BeforeTest
	public void setUP() {
		htmlReporter = new ExtentHtmlReporter("extent.xml");
		
		//create ExtentReports and attach report(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
	}

	@Test
	public void whTestReport() throws IOException {
		//creates a toggle for the given test, adds all log events under it
		ExtentTest test = extent.createTest("WandaTest", "Desc of test");
		
		//create logs
		 // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("whscreenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("whscreenshot.png");
		
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
        extent.flush();
	}

}
