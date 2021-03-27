
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.safari.SafariDriver;


public class MainTest {

    public static WebDriver driver;

    @BeforeAll
    static void setUp(){
         driver = new SafariDriver();

    }

    @AfterAll
    static void tearDown(){
        driver.close();
    }

    @Test
    public void openBrowser(){
        driver.get("http://www.google.com/");

        sleep();

        driver.findElement(By.cssSelector("input")).sendKeys("Gunjan Kumar" + Keys.ENTER);


//        driver.findElement(By.name("btnK")).click();

        sleep();
    }


    private void sleep(){
        try {
            Thread.sleep(5000);
        }
        catch (Exception e) {
            // Do nothing
        }
    }

}


