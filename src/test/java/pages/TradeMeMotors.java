package pages;

public class TradeMeMotors extends BasePage {
  
  private String makeDropdown = "(//select[@name='selectedMake'])";
  private String search = "//button[contains(text(),'View 32,000+ listings')]";
  private String resultsLabel = "//h3[@class='tm-search-header-result-count__heading ng-star-inserted']";
  
  public TradeMeMotors(){
    super(driver);
  }

  public void navigateToTradeMe(){
    navigateTo("https://www.trademe.co.nz/a/motors");
  }

  public int makeDropdownSize(){
    return dropDownSize(makeDropdown);
  }

  public void selectMakeFromDropdown(String make){
    selectFromDropdownByVisibleText(makeDropdown,make);
  }

  public void clickSearch(){
    clickElement(search);
  }

  public String resultsAmount(){
    return textFromElement(resultsLabel);
  }
}