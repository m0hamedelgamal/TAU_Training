package getBrokenImages;

import base.BaseTests;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;

public class GetBrokenImgTest extends BaseTests {

    @Test
    public void getbrokenimg() throws URISyntaxException, IOException, InterruptedException {
        var brokenimg = homePage.OpenBrokenImagesPage();
        brokenimg.getImg();

    }
}
