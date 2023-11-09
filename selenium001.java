package org.example;


import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class selenium001 {


//
//@BeforeTest
//public void openBrowser(){
//
//
//}
@Owner("Ankita Sinha")
@Test
public void negativeTC(){
        // <input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">
        // <input type="password" class="text-input W(100%)" name="password" id="login-password" data-qa="jobodapuxe">
        //<button type="submit" id="js-login-btn" class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)" data-qa="sibequkica">
        //	<div class="notification-box-description" id="js-notification-box-msg" data-qa="rixawilomi">Your email, password, IP address or location did not match</div>								<span class="icon loader hidden" data-qa="zuyezasugu"></span>
        //									<span data-qa="ezazsuguuy">Sign in</span>

        //Flow To automate
        //Naviagte to URL
        //	find the first element username and enter the email id							</button>
        //	find the second element username and enter the password							</button>
        //	find the third element username and click/submit							</button>


       // WebDriver driver = new ChromeDriver();
        //driver.get("https://sdet.live");

        //create session via the API and Session id is generated

    EdgeDriver driver = new EdgeDriver();
    driver = new EdgeDriver();
    driver.get("https://app.vwo.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        // Page load strategy - normal in nature,which all resource will load we will wait for all reource to load
        driver.manage().window().maximize();
        //EdgeOptions options = new EdgeOptions();
        //options.addArguments("--start-maximized");

        WebElement username =driver.findElement(By.id("login-username"));
        username.sendKeys("abc@gmail.com");

        WebElement password =driver.findElement(By.id("login-password"));
        password.sendKeys("123");

        WebElement button_submit =driver.findElement(By.id("js-login-btn"));
        button_submit.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement error_message =driver.findElement(By.id("js-notification-box-msg"));
        //System.out.println(error_message.getText());
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");
driver.quit();
    }
  @Test
    public void positiveTC(){
      EdgeDriver edgeDriver =new EdgeDriver();
    edgeDriver.get("https://app.vwo.com");

        System.out.println(edgeDriver.getCurrentUrl());
        System.out.println(edgeDriver.getTitle());

        edgeDriver.manage().window().maximize();

        WebElement username =edgeDriver.findElement(By.id("login-username"));
        username.sendKeys("ankita0325sinha@gmail.com");

        WebElement password =edgeDriver.findElement(By.id("login-password"));
        password.sendKeys("Ankita@0325");

        WebElement button_submit =edgeDriver.findElement(By.id("js-login-btn"));
        button_submit.click();

       edgeDriver.quit();


    }

}
