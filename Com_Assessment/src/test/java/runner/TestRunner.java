package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\N L Yashaswini\\Downloads\\BDD (1)\\BDD\\src\\test\\java\\Features",
		glue="StepDefinations")
public class TestRunner extends AbstractTestNGCucumberTests{

}
