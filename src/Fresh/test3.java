package Fresh;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test3{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).submit();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@alt=\"Create Organization...\"]")).click();
		driver.findElement(By.xpath("//input[@onfocus=\"this.className='detailedViewTextBoxOn'\"]")).sendKeys("star3");
	WebElement e=	driver.findElement(By.name("industry"));
		Select s=new Select(e);
		s.selectByVisibleText("Chemicals");
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//img[@style=\"padding: 0px;padding-left:5px\"]"));
		Actions b=new Actions(driver);
		b.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();

}
}