

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "E:\\Download\\95\\chromedriver.exe");
    	WebDriver d = new ChromeDriver();
    	d.manage().window().maximize();
    	d.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&ignoreAuthState=1&prevRID=9RY6NVVTYRT51D2C2WPD&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&disableLoginPrepopulate=1&switch_account=signin&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    	d.findElement(By.id("ap_email")).sendKeys("nithya2000chinnikj@gmail.com");
    	d.findElement(By.id("continue")).click();
    	d.findElement(By.id("ap_password")).sendKeys("nithya123");
    	d.findElement(By.id("signInSubmit")).click();
    	//d.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/h2[2]/form/button")).click();
 	
	
    }
}
