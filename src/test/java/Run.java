import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = ".",dryRun = false, tags = {"@menu"})
//plugin = "com.cucumber.listener.ExtentCucumberFormatter:target/report/tsr,html")
public class Run {

   // public static String xmlReportPath = new File("src/main/resources/extent-config.xml").getAbsolutePath();
    //copy path from content root from extent-config.xml
    //public static string parameter(xmlReportPath)

  /*  @AfterClass
    public static void generateReport()
    {
        Reporter.loadXMLConfig(xmlReportPath);
        //copy absolute path from extent-config.xml
    }*/
}
