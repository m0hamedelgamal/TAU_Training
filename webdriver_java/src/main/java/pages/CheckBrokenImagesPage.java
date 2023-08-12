package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class CheckBrokenImagesPage {
    private WebDriver driver;
    private By img = By.xpath("//div[@class=\"example\"]//img");

    public CheckBrokenImagesPage(WebDriver driver) {
        this.driver = driver;

    }

    public void getImg() throws URISyntaxException, IOException, InterruptedException {
        List<WebElement> listOfImages = driver.findElements(img);

        for (WebElement brokenimage : listOfImages) {
            String url = brokenimage.getAttribute("src");

            HttpClient client = HttpClient.newBuilder().build();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .build();
            HttpResponse response = client.send(request
                    , HttpResponse.BodyHandlers.ofString());
            int statuscode = response.statusCode();
            if (statuscode != 200)
                System.out.println(("The current link is not valid " + url));
            else
                System.out.println(("The current link is valid " + url));


        }


    }
}


