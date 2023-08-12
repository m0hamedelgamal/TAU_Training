package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxsPage {
    WebDriver driver;

    By checkboxs = By.xpath("//form//input[@type='checkbox']");

    public CheckBoxsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkAndUncheck() {
        List<WebElement> getCheckBox = driver.findElements(checkboxs);
        for (WebElement clickCheckBox : getCheckBox) {
            if (clickCheckBox.isSelected()) {
                clickCheckBox.click();

            } else {
                clickCheckBox.click();
            }
        }

    }

}
