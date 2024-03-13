
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "steps")
public class TestRunner {

    // @AfterClass
    // public static void afterAll(){
    // System.out.println("This will run after all");
    // WrapMobileDriver.getInstance().quit();
    // }
}
