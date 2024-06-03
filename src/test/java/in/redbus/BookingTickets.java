package in.redbus;

import java.time.Duration;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookingTickets {
	public static WebDriver driver;
	@BeforeClass
	public static void method1(){
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("disable-notifications");
		options.addArguments("disable-popups");
		options.addArguments("start-maximized");
		driver = new EdgeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	@Test
	public void method2() {
	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("chennai");
	driver.findElement(By.xpath("//text[text()='Chennai']")).click();
	}
	@Test
	public void method3() {
	driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("trichy");
	driver.findElement(By.xpath("//text[text()='Trichy']")).click();
		}
	@Test
	public void method4() {
	driver.findElement(By.xpath("//span[text()='3' and contains(@class,'fgdqFw')]")).click();
		}
	@Ignore
	@Test
	public void method5() {
		driver.quit();
	}
	@Test
	public void method6() {
	driver.findElement(By.xpath("//button[@id='search_button']")).click();
	}
	@Test
	public void method7() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> a=driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
		List<WebElement> b=driver.findElements(By.xpath("//div[@class='dp-time f-19 d-color f-bold']"));
		List<WebElement> c=driver.findElements(By.xpath("//div[@class='bp-time f-19 d-color disp-Inline']"));
		List<WebElement> d=driver.findElements(By.xpath("//span[@class='f-19 f-bold']"));
		System.out.println("Available Buses:");
		for(int i=0; i<a.size(); i++) {
			WebElement e = a.get(i);
			System.out.print(e.getText()+" ");
				}
		System.out.println("\n");
		System.out.println("departure:");
		for(int j=0; j<b.size(); j++) {
		WebElement f = b.get(j);
		System.out.print(f.getText()+" ");
	}
		System.out.println("\n");
		System.out.println("Arrival:");
		for(int k=0; k<c.size(); k++) {
			WebElement g = c.get(k);
			System.out.print(g.getText()+" ");
		}
		System.out.println("\n");
		System.out.println("Bus fare:");
		for(int l=0; l<d.size(); l++) {
			WebElement h = d.get(l);
			System.out.print(h.getText()+" ");
		}
	}
	}
