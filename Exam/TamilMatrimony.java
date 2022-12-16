package Exam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.tamilmatrimony.in/");
		
		WebElement profile=driver.findElement(By.id("REGISTERED_BY"));
		Select profileDropDown=new Select(profile);
		profileDropDown.selectByValue("1");
		
		driver.findElement(By.xpath("//input[@class='hp-regform-txtfield']")).sendKeys("Ajay Michael");
		driver.findElement(By.xpath("//dd[@class='paddt5']/label")).click();
		
		WebElement religion=driver.findElement(By.id("RELIGION"));
		Select religionDropDown=new Select(religion);
		religionDropDown.selectByValue("12");
		
		WebElement motherTounge=driver.findElement(By.id("MOTHERTONGUE"));
		Select motherToungeDropDown=new Select(motherTounge);
		motherToungeDropDown.selectByValue("47");
		
		
		WebElement country=driver.findElement(By.id("COUNTRY"));
		Select countryDropDown=new Select(country);
		countryDropDown.selectByValue("98");
		
//		Day of Birth
	    WebElement day=driver.findElement(By.id("DOBDAY"));
		Select dayDropDown=new Select(day);
	    dayDropDown.selectByValue("29");
		
		WebElement month=driver.findElement(By.id("DOBMONTH"));
		Select monthDropDown=new Select(month);
		monthDropDown.selectByValue("11");
		
		WebElement year=driver.findElement(By.id("DOBYEAR"));
		Select yearDropDown=new Select(year);
		yearDropDown.selectByValue("2000");
		
		WebElement code=driver.findElement(By.id("M_COUNTRYCODE"));
		Select codeDropDown=new Select(code);
		codeDropDown.selectByVisibleText("+91");
		 
		WebElement mobileNumber=driver.findElement(By.id("MOBILENO"));
		mobileNumber.sendKeys("76758668");
		
		driver.findElement(By.id("EMAIL")).sendKeys("majay3574");
		
		driver.close();
	}

}
