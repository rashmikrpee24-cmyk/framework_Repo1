package genericfileUtility;

import java.lang.reflect.Method;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageTest {

    @Test
    public void homepageTest(Method mtd) {

        System.out.println(mtd.getName() + " Test Start");

        SoftAssert sa = new SoftAssert();

        System.out.println("step-1");
        System.out.println("step-2");

        // soft assert — will not stop test immediately
        sa.assertEquals("Home", "Home");

        System.out.println("step-3");

        // hard assert — will stop test here if fails
        Assert.assertEquals("Title", "Title-1");

        System.out.println("step-4"); // will NOT print if hard assert fails

        sa.assertAll(); // reports soft assert failures

        System.out.println(mtd.getName() + " Test End");
    }

    @Test
    public void homepageTest1(Method mtd) {

        System.out.println(mtd.getName() + " Test Start");

        SoftAssert sa = new SoftAssert();

        System.out.println("step-1");
        System.out.println("step-2");

        sa.assertTrue(true);

        System.out.println("step-3");
        System.out.println("step-4");

        sa.assertAll();

        System.out.println(mtd.getName() + " Test End");
    }
}