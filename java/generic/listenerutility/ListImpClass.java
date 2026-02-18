package generic.listenerutility;
import org.testng.*;
import genericfileUtility.ScreenshotUtility;
import genericfileUtility.UtilityClassObject;

import java.util.Date;

public class ListImpClass implements ITestListener {

	    @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("TEST STARTED: " + result.getMethod().getMethodName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("TEST PASSED: " + result.getMethod().getMethodName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {

	        System.out.println("TEST FAILED: " + result.getMethod().getMethodName());

	        try {
	            String name = result.getMethod().getMethodName()
	                    + new Date().toString().replace(" ", "_").replace(":", "_");

	            ScreenshotUtility.capture(
	                UtilityClassObject.getDriver(), name);

	            System.out.println("Screenshot captured");
	        }
	        catch (Exception e) {
	            System.out.println("Screenshot failed");
	        }
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("TEST SKIPPED: " + result.getMethod().getMethodName());
	    }

	    @Override
	    public void onStart(ITestContext context) {
	        System.out.println("=== Suite Started ===");
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        System.out.println("=== Suite Finished ===");
	    }
	}

