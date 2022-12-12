package Fresh;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/s?bbn=1389401031&rh=n%3A1389401031%2Cp_36%3A1318505031&dc&qid=1670781041&rnid=1318502031&ref=lp_1389401031_nr_p_36_2");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println(driver.getTitle());
	
List<WebElement> ele=driver.findElements(By.className("a-price-whole"));

for(WebElement s:ele)

{

System.out.println(s.getText());
}
}
}