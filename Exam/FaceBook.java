package Exam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/'");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.linkText("Create New Account")).click();
	driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Ajay");
	driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Michael");
	driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("majay3574@gmail.com");
    driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[4]")).sendKeys("majay3574@gmail.com");
    driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("passworD@1234");
    
    WebElement day=driver.findElement(By.id("day"));
    Select dayDropDown=new Select(day);
    dayDropDown.selectByValue("29");
    
    WebElement month=driver.findElement(By.id("month"));
    Select monthDropDown=new Select(month);
    monthDropDown.selectByValue("11");
    
    WebElement year=driver.findElement(By.id("year"));
    Select yearDropDown=new Select(year);
    yearDropDown.selectByValue("2000");
    
    driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
    driver.close();
}
}
