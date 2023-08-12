package DisappearingElements;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class DisappearingElementsTest extends BaseTests {

    @Test(priority = 1)
    public void getHomePage() {
        var get_disappearing_ElementPage = homePage.Open_Disappearing_Elements();
        assertEquals(get_disappearing_ElementPage.checkTheHomepagelink(),
                "https://the-internet.herokuapp.com/",
                "Home Page Link is incorrect ");
    }

    @Test(priority = 2)
    public void getAboutPage() {
        var get_disappearing_ElementPage = homePage.Open_Disappearing_Elements();
        assertEquals(get_disappearing_ElementPage.checkAboutlink(),
                "https://the-internet.herokuapp.com/about/",
                "Home Page Link is incorrect ");
    }

    @Test(priority = 3)
    public void getContactUsPage() {
        var get_disappearing_ElementPage = homePage.Open_Disappearing_Elements();
        assertEquals(get_disappearing_ElementPage.checkThecontactUslink(),
                "https://the-internet.herokuapp.com/contact-us/",
                "Home Page Link is incorrect ");
    }

    @Test(priority = 4)
    public void getPortofolioPage() {
        var get_disappearing_ElementPage = homePage.Open_Disappearing_Elements();
        assertEquals(get_disappearing_ElementPage.checkThePortofoliolink(),
                "https://the-internet.herokuapp.com/portfolio/",
                "Home Page Link is incorrect ");
    }


}
