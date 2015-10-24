package hello;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

/**
 * Created by tong on 24/10/2015.
 */

@RunWith(Cucumber.class)
@CucumberOptions(format = "pretty")
public class TestIT {

    @Test
    public void test() throws InterruptedException {
        Thread.sleep(5000);
        assertTrue(true);
    }
}
