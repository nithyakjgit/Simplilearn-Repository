package TestNg.testng;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class test {
	//test case is pass without any assert-by checking the flow 
	@Test(priority = 1)
	  public void register() {
		System.setProperty("webdriver.chrome.driver", "E:\\Download\\95\\chromedriver.exe");
		
	      WebDriver wd=new ChromeDriver();
	      wd.manage().window().maximize();
	      wd.get("https://www.amazon.in/");
	      wd.findElement(By.id("nav-link-accountList")).click();
	      wd.findElement(By.id("createAccountSubmit")).click();
	      wd.findElement(By.id("ap_customer_name")).sendKeys("ABCDEF");
	      //wd.findElement(By.id("ap_phone_number")).sendKeys("1234567890");
	      wd.findElement(By.id("ap_email")).sendKeys("ABCDE@gmail.com");
	      wd.findElement(By.id("ap_password")).sendKeys("12345678");
	      wd.findElement(By.id("ap_password_check")).sendKeys("12345678");
	     // wd.findElement(By.id("continue")).click();

	     
	  }
	@Test(priority = 2)
	  public void login() {
		System.setProperty("webdriver.chrome.driver", "E:\\Download\\95\\chromedriver.exe");
		 
	      WebDriver wd=new ChromeDriver();
	      wd.manage().window().maximize();
	      wd.get("https://www.amazon.in/");
	      wd.findElement(By.id("nav-link-accountList")).click();
	      wd.findElement(By.id("ap_email")).sendKeys("ABCDE@gmail.com");
		  wd.findElement(By.id("continue")).click();
	      wd.findElement(By.id("ap_password")).sendKeys("12345678");


	  }
	  @Test(priority = 3)
	  public void addToCart() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "E:\\Download\\95\\chromedriver.exe");
		 
		  	WebDriver wd=new ChromeDriver();
	      	wd.get("https://www.amazon.in/");
		    System.out.println(wd.getTitle());
		    System.out.println(wd.getCurrentUrl());
		    wd.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("soap");
	        wd.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
	        wd.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[17]/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
	        Set<String> ids = wd.getWindowHandles();
	        Iterator<String> it = ids.iterator();
	        String parentId = it.next();
	        String childId = it.next();
	      wd.switchTo().window(childId);
	       wd.findElement(By.id("add-to-cart-button")).click();
	    }


}