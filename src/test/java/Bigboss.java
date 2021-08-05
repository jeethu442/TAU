import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Bigboss {

    public static void action(String username) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://voting.voot.com/vote/6b3d31e0-7b1e-11eb-a1af-d93c47ce2886?&uid=eu76f0wLE5eRgYNb985GsxFf0tiV&platform=web");
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("email")).sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("Jeethu442");
        driver.findElement(By.id("password")).sendKeys(Keys.RETURN);
        Thread.sleep(5000);
        for (int i = 0; i < 99; i++) {
            //Thread.sleep(5000);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[contains(@src,'https://voot-interactivity.s3-ap-south-1.amazonaws.com/voting/contestant/image/Colors Kannada/BBK-Contestant-Prashanth_260x210.jpeg')")));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[contains(@src,'https://voot-interactivity.s3-ap-south-1.amazonaws.com/voting/contestant/image/Colors Kannada/BBK-Contestant-Prashanth_260x210.jpeg')]")));
            driver.findElement(By.xpath("//img[contains(@src,'https://voot-interactivity.s3-ap-south-1.amazonaws.com/voting/contestant/image/Colors Kannada/BBK-Contestant-Prashanth_260x210.jpeg')]")).click();
            driver.findElement(By.className("jss190")).click();

            Thread.sleep(2000);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/button")));
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/button")).click();
            Thread.sleep(1500);
        }
        driver.close();
    }

    public static void accountCreation() throws InterruptedException {
        for (int i = 12; i <= 150; i++) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://voting.voot.com/vote/6b3d31e0-7b1e-11eb-a1af-d93c47ce2886?&uid=eu76f0wLE5eRgYNb985GsxFf0tiV&platform=web");
            driver.findElement(By.id("email")).sendKeys("jeethu.u" + i + "@gmail.com");
            driver.findElement(By.id("email")).sendKeys(Keys.RETURN);
            Thread.sleep(2000);
            driver.findElement(By.id("password")).sendKeys("Jeethu442");
            driver.findElement(By.id("password")).sendKeys(Keys.RETURN);
            Thread.sleep(2000);
            driver.findElement(By.id("name")).sendKeys("Jeethu");
            driver.findElement(By.id("dob")).sendKeys("16/03/1993");
            List<WebElement> l = driver.findElements(By.className("genderWrapper"));
            l.get(1).click();
            driver.findElement(By.xpath("//img[contains(@src,'/images/rightarrow.svg')]")).click();
            Thread.sleep(1500);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div[2]/button")).click();
            Thread.sleep(1500);
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/button")).click();
            Thread.sleep(1500);
            driver.close();
        }
    }

    public static void main(String[] args) throws InterruptedException {

       /* action("jeethu.u2@gmail.com");
        action("jeethu.u3@gmail.com");
        action("jeethu.u4@gmail.com");
        action("jeethu.u5@gmail.com");
        action("jeethu.u6@gmail.com");
        action("jeethu.u7@gmail.com");
        action("jeethu.u8@gmail.com");
        action("jeethu.u9@gmail.com");
        action("jeethu.u10@gmail.com"); */
       for(int i=41;i<=100;i++) {
           action("jeethu.u"+i+"@gmail.com");
       }

        //accountCreation();


    }
}



