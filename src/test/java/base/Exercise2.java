package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Exercise2 {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(375,812));

        /* To return the first element with the matching identifier, use findElement*/
        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();

        /* To return count of all matching webelements, use findElements */
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());

        System.out.println(driver.getTitle());
        //driver.quit();
    }

    public static void main(String args[])
    {
        Exercise2 test = new Exercise2();
        test.setUp();
    }
}
