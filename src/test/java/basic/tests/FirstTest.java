package basic.tests;

import basic.pages.google.GoogleMainPage;
import basic.pages.google.ListOfLinkResultsPage;
import org.junit.*;
import org.openqa.selenium.support.PageFactory;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;


public class FirstTest extends TestConditions {


    @Test
    public void verifySearchQueryOnUiOnPageObject() {
        driver.get("https://www.google.com");

        GoogleMainPage googleMainPage = PageFactory.initElements(driver, GoogleMainPage.class);
        googleMainPage.sendTextInSearchInput("Hello, World");
        googleMainPage.pressEnter();

        ListOfLinkResultsPage listOfLinkResultsPage = PageFactory.initElements(driver, ListOfLinkResultsPage.class);
        String textOfLinkElement = listOfLinkResultsPage.getFirstLinkText();

        assertThat("Page does not contain string Hello", textOfLinkElement.toLowerCase(), containsString("hello"));
        assertThat("Page does not contain string World", textOfLinkElement.toLowerCase(), containsString("world"));
    }













    /*
    @Test
    public void verifySearchQueryOnUi() {
        driver.get("https://google.com.ua");
        driver.findElement(By.id(Locators.SEARCH_INPUT_ID)).clear();
        driver.findElement(By.id(Locators.SEARCH_INPUT_ID)).sendKeys("Hello World");
        driver.findElement(By.id(Locators.SEARCH_INPUT_ID)).sendKeys(Keys.ENTER);
        WebElement firstLink = driver.findElements(By.xpath(Locators.FIRST_LINK_WITH_TEXT_HELLO_WORLD)).get(0);
        Assert.assertThat("Page does not contain string Hello", firstLink.getText(), containsString("Hello"));
        Assert.assertThat("Page does not contain string World", firstLink.getText(), containsString("World"));
    }
*/


}
