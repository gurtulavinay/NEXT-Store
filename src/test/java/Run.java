import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(features = ".",dryRun = false, tags = {"@login"})
//plugin = "com.cucumber.listener.ExtentCucumberFormatter:target/report/tsr.html")
public class Run {
    /*public static String xmlReport = new File ("src/main/resources/extent-config.xml").getAbsolutePath();
    @After
    public static void generateReport(){
        Reporter.loadXMLConfig(xmlReport);
    }
*/


}

