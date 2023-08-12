package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DisappearingElementsPage {
    WebDriver driver;
    private By Home = By.xpath("//a[@href=\"/\"]");
    private By about = By.xpath("//a[@href=\"/about/\"]");
    private By contactUs = By.xpath("//a[@href=\"/contact-us/\"]");
    private By portofolioe = By.xpath("//a[@href=\"/portfolio/\"]");
    public DisappearingElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String checkTheHomepagelink() {
        driver.findElement(Home).click();
        String currenturl = driver.getCurrentUrl();
        System.out.println("CurrentPageURL is " + currenturl);
        return currenturl;

    }

    public String checkAboutlink() {
        driver.findElement(about).click();
        String currenturl = driver.getCurrentUrl();
        System.out.println("CurrentPageURL is " + currenturl);
        return currenturl;
    }

    public String checkThecontactUslink() {
        driver.findElement(contactUs).click();
        String currenturl = driver.getCurrentUrl();
        System.out.println("CurrentPageURL is " + currenturl);
        return currenturl;
    }

    public String checkThePortofoliolink() {
        driver.findElement(portofolioe).click();
        String currenturl = driver.getCurrentUrl();
        System.out.println("CurrentPageURL is " + currenturl);
        return currenturl;
    }


}
