package utilits;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Com.ComCast.CRM.genericbasetest.BaseClass_;

public class SuiteListener implements ITestListener, IAnnotationTransformer {

    @Override
    public void onTestFailure(ITestResult result) {

        String methodName = result.getMethod().getMethodName();

        String filePath = System.getProperty("user.dir")
                + File.separator + "screenshots"
                + File.separator + methodName + ".png";

        TakesScreenshot ts = (TakesScreenshot) BaseClass_.sdriver;
        File src = ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(src, new File(filePath));
            System.out.println("Screenshot saved: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
