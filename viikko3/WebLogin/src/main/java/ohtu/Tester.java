package ohtu;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Tester {

    public static void main(String[] args) {

        WebDriver driver = new HtmlUnitDriver();

        Random r = new Random();

        driver.get("http://localhost:4567");

        // 1. TAPAUS: Epäonnistunut kirjautuminen: Oikea käyttäjätunnus(aku), väärä salasana

        // tulostetaan sivu konsoliin
/*         System.out.println(driver.getPageSource());
        
        sleep(2);
        
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();

        sleep(2);

        element = driver.findElement(By.name("username"));
        element.sendKeys("aku");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkep");
        element = driver.findElement(By.name("login"));
        
        sleep(2);
        element.submit();

        sleep(3);

        // tulostetaan sivu konsoliin
        System.out.println(driver.getPageSource()); */



        // 2. TAPAUS: Uuden käyttäjätunnuksen luominen: Tunnus: Mikki+randomInt, Salasana: HessuH0po

/*         System.out.println(driver.getPageSource());
        
        sleep(2);
        
        WebElement element = driver.findElement(By.linkText("register new user"));
        element.click();

        sleep(2);

        element = driver.findElement(By.name("username"));
        element.sendKeys("Mikki"+r.nextInt(10000));
        element = driver.findElement(By.name("password"));
        element.sendKeys("HessuH0po");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("HessuH0po");
        element = driver.findElement(By.name("signup"));
        // element.click();
        
        sleep(2);
        element.submit();

        sleep(3);

        // tulostetaan sivu konsoliin
        System.out.println(driver.getPageSource()); */


        // 3. TAPAUS: Uuden käyttäjätunnuksen jälkeen tapahtuma uloskirjautuminen sovelluksesta


        System.out.println(driver.getPageSource());
        
        sleep(2);
        
        WebElement element = driver.findElement(By.linkText("register new user"));
        element.click();

        sleep(2);

        element = driver.findElement(By.name("username"));
        element.sendKeys("Mikki"+r.nextInt(10000));
        element = driver.findElement(By.name("password"));
        element.sendKeys("HessuH0po");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("HessuH0po");
        element = driver.findElement(By.name("signup"));
        // element.click();
        
        sleep(2);
        element.submit();

        sleep(3);

        // tulostetaan sivu konsoliin
        System.out.println(driver.getPageSource());

        element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();

        System.out.println(driver.getPageSource());

        sleep(2);

        element = driver.findElement(By.linkText("logout"));
        element.click();

        sleep(1);

        System.out.println(driver.getPageSource());
        
        driver.quit();
    }
    
    private static void sleep(int n){
        try{
            Thread.sleep(n*1000);
        } catch(Exception e){}
    }
}
