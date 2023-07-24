package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    
protected static WebDriver driver;
private static WebDriverWait wait;

static {
        ChromeOptions chromeOptions = new ChromeOptions();
         driver = new ChromeDriver(chromeOptions);
         wait = new WebDriverWait(driver,10);
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver,10);

    }

    public static void navigateTo(String url){
        driver.get(url);
    }

    public static void CloseBrowser(){
        driver.quit();
    }

    private WebElement findMe(String Locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator)));
    }

    public void clickElement(String locator){
    findMe(locator).click();
    }

    public void write(String locator, String texToWrite){
        findMe(locator).clear();
        findMe(locator).sendKeys(texToWrite);
    }

    public int dropDownSize(String Locator) {
        Select dropdown = new Select(findMe(Locator));
        List<WebElement> dropdownOptions = dropdown.getOptions();
        return dropdownOptions.size();
    }

    public void selectFromDropdownByValue(String locator, String valueToSelect){
        Select dropdown = new Select(findMe(locator));

        dropdown.selectByValue(valueToSelect);
}

    public void selectFromDropdownByIndex(String locator, int valueToSelect){
        Select dropdown = new Select(findMe(locator));

        dropdown.selectByIndex(valueToSelect);
}

public void selectFromDropdownByVisibleText(String locator, String valueToSelect){
        Select dropdown = new Select(findMe(locator));

        dropdown.selectByVisibleText(valueToSelect);
}

public void switchToiFrame(int iFrameIndex){
    driver.switchTo().frame(iFrameIndex);
}

public void switchToParentFrame(){
    driver.switchTo().parentFrame();
}

public void dismissAlert(){
    driver.switchTo().alert().dismiss();
}

public String textFromElement(String locator){
    return findMe(locator).getText();
}

// el locator es el xpath + row y column que son argumentos así los podemos usar con cualquier valor y no solamente con uno, la parte /table/tbody se usa para todas las tablas y tr es row y td es columna//
public String getValueFromTable(String locator, int row, int column){
    String cellINeed = locator+"/table/tbody/tr["+row+"]/td["+column+"]";

    return findMe(cellINeed).getText();
}

public boolean elementIsDisplayed(String locator){
    try {
        return findMe(locator).isDisplayed();
    } catch (org.openqa.selenium.NoSuchElementException e){
        return false;
    }
}

public boolean elementEnabled(String locator){
    try {
        return findMe(locator).isEnabled();
    } catch (org.openqa.selenium.NoSuchElementException e){
        return false;
    }
}

public boolean elementIsSelected(String locator){
    try {
        return findMe(locator).isSelected();
    } catch (org.openqa.selenium.NoSuchElementException e){
        return false;
    }
}

public List<WebElement> bringMeAllElements(String locator){
    return driver.findElements(By.className(locator));
}


}
