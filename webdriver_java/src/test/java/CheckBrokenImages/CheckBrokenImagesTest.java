package CheckBrokenImages;

import base.BaseTests;
import org.testng.annotations.Test;

public class CheckBrokenImagesTest extends BaseTests {


    @Test
    public void Checkbroken() {
        var brokenimagecheck = homePage.OpenBrokenImagesPage();

    }

}
