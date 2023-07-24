package steps;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TradeMeMotors;

public class TradeMeMotorsSteps {
    TradeMeMotors trade = new TradeMeMotors();

    @Given("^I navigate to the TradeMe motor page$")
    public void navigateToTradeMe(){
      trade.navigateToTradeMe();
    }

    @Then("^I can verify that the number of motor makes is (\\d+)$")
    public void returnAmountOfMakes(int makeAmount){
      int expectedAmount = makeAmount;
      int actualAmount = trade.makeDropdownSize();
      Assert.assertEquals(expectedAmount, actualAmount);
    }

    @When("^I select the car make (.+)$")
    public void selectMake(String make){
      trade.selectMakeFromDropdown(make);

    }
    @Then("^I can see the (.+) in the results$")
    public void printAmount(String expectedAmoutOfResults){
      trade.clickSearch();
      Assert.assertEquals("Showing "+expectedAmoutOfResults+" results", trade.resultsAmount());
      }
    

    }

