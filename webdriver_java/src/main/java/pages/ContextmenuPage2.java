package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Helper;

public class ContextmenuPage2 {

    private WebDriver driver;
    Helper myhelper = new Helper(driver);

    private By contextmenu = By.id("hot-spot");

    public ContextmenuPage2(WebDriver driver) {
        this.driver = driver;
    }


    public void clickTheContextmenu() {
        myhelper.actionsRightClick(driver, driver.findElement(contextmenu));
    }

    public void validateTheAlert() {

        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        myhelper.actionsClick(driver, driver.findElement(contextmenu));
    }


}


