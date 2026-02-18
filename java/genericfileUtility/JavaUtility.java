package genericfileUtility;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

	    public int getRandomNumber(){
	    	        return new Random().nextInt(1000);
	    	    }

	    	    public String getTimeStamp() {
	    	        return new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	    	    }

	    	    public String getUniqueName(String base) {
	    	        return base + "_" + getRandomNumber();
	    	    }
	    	}
	    	