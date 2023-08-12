package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddOrRemoveElementsPage {

    private WebDriver driver;
    private By addbtn = By.xpath("//button[@onclick='addElement()']");
    private By deletebtns = By.xpath("//button[@onclick='deleteElement()']");

    public AddOrRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickaddbtn() {

        for (int i = 1; i <= 10; i++) {
            driver.findElement(addbtn).click();
        }
    }

    public void clickdeletebtn() {
        List<WebElement> deletebtns = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        for (WebElement delbtn : deletebtns) {
            delbtn.click();

        }


    }


}
