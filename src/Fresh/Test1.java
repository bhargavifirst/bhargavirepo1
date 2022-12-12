package Fresh;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8888");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).submit();
	
	
	driver.findElement(By.xpath("//td[@class=\"tabUnSelected\"][4]")).click();
	driver.findElement(By.xpath("//img[@alt=\"Create Contact...\"]")).click();
	driver.findElement(By.name("lastname")).sendKeys("sahiti");
	driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"][1]")).click();
	String s=driver.findElement(By.className("dvHeaderText")).getText();
	if(s.contains("sahiti")) {
		System.out.println("pass");
	}
		else {
			System.out.println("fail");
	}
	Actions a=new Actions(driver);
	WebElement e=driver.findElement(By.xpath("//img[@style=\"padding: 0px;padding-left:5px\"]"));
	a.moveToElement(e).perform();
	driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();
	
}
}
