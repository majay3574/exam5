package Exam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiBank {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("firstName")).sendKeys("Ajay");
		
		WebElement title = driver.findElement(By.id("title"));
		Select titleDropDown=new Select(title);
		titleDropDown.selectByVisibleText("Mr");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Michael");
		
		WebElement sex = driver.findElement(By.id("sex"));
		Select sexDropDown=new Select(sex);
		sexDropDown.selectByVisibleText("Male");
		
		WebElement employmentStatus = driver.findElement(By.id("employmentStatus"));
		Select employmentStatusDropDown=new Select(employmentStatus);
		employmentStatusDropDown.selectByVisibleText("Unemployed");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("11/29/2000");
		
		WebElement maritalStatus = driver.findElement(By.id("maritalStatus"));
		Select maritalStatusDropDown=new Select(maritalStatus);
		maritalStatusDropDown.selectByVisibleText("Single");
		driver.findElement(By.xpath("//input[@id='numberOfDependents']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Majay");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("majay3574@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("nope for@123");
		driver.close();
	}

}
