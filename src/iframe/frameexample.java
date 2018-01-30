package iframe;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;





public class frameexample {
	public static void main(String[] args) throws InterruptedException {
		// 1000 Auto-generated method stub
		//E:\WORK SPACE\selenium-java-jar\libs
		System.setProperty("webdriver.gecko.driver", "E:\\WORK SPACE\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("http://toolsqa.com/iframe-practice-page/");
	WebElement iframe = driver.findElement(By.cssSelector("#IF2"));
	driver.switchTo().frame(iframe);
	String text = driver.findElement(By.cssSelector("div.col-md-4:nth-child(1) > h5:nth-child(1)")).getText();
	System.out.println(text);
    Assert.assertEquals("Unique & Clean", text);
    System.out.println("Result passed");
    driver.switchTo().defaultContent();
    String text2 = driver.findElement(By.cssSelector(".h1-size")).getText();
    System.out.println(text2);
	
	}
	 

}
