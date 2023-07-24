package steps.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/features/",
monochrome = true,

glue = "steps",
tags = "@TradeMe"
)

public class TradeMeTestRunner{
    @AfterClass
    public static void cleanDriver() {
        BasePage.CloseBrowser();
}
}
