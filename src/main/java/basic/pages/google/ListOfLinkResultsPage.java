package basic.pages.google;

import basic.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListOfLinkResultsPage extends PageObject {

    @FindBy(xpath = "(//div[@class='srg']//a)[1]")
    private WebElement firstLink;


    public String getFirstLinkText() {
        return firstLink.getText();
    }


}
