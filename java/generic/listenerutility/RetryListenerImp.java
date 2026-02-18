package generic.listenerutility;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class RetryListenerImp implements IRetryAnalyzer {

	    private int retryCount = 0;
	    private static final int maxRetryCount = 2; // number of retries

	    @Override
	    public boolean retry(ITestResult result) {

	        if (retryCount < maxRetryCount) {
	            retryCount++;
	            System.out.println("Retrying test: " 
	                    + result.getName() 
	                    + " | Retry count: " + retryCount);
	            return true;
	        }

	        return false;
	    }
	}
