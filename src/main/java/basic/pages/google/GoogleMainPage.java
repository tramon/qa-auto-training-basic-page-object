package basic.pages.google;

import basic.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GoogleMainPage extends PageObject {

    @FindBy(id = "lst-ib")
    private WebElement searchInput;


    public void sendTextInSearchInput(String text) {
        searchInput.sendKeys(text);
    }

    public void pressEnter() {
        searchInput.sendKeys(Keys.ENTER);

    }

    public WebElement getSearchInput(){
        return searchInput;
    }

}
