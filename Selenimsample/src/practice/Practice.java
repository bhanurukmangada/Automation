package practice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Redio button
		WebElement drop1 = driver.findElement(By.xpath("//input[@id='benzradio']"));
		
		drop1.click();
		System.out.println(drop1.isSelected());
		Thread.sleep(2000);
		
		//Drop down
		WebElement drop2 = driver.findElement(By.id("carselect"));
		Thread.sleep(2000);
		Select s=new Select(drop2);
		
		s.selectByValue("benz");
		Thread.sleep(2000);
		s.selectByVisibleText("Benz");
		Thread.sleep(2000);
		s.selectByIndex(2);
		
		//multiple select
		WebElement drop3 = driver.findElement(By.id("multiple-select-example"));
		Thread.sleep(2000);
		Select s1=new Select(drop3);
		Thread.sleep(2000);
		s1.selectByValue("peach");
		Thread.sleep(2000);
		s1.selectByIndex(2);
		
		//To featch the current url
		
		String url = driver.getCurrentUrl();
		System.out.println("current url" +url);
		
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("bhanu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		Thread.sleep(2000);
		
		//Check box
		
		WebElement ch = driver.findElement(By.xpath("//input[@id='benzcheck']"));
		boolean b = ch.isSelected();
		System.out.println(b);

		if(b)
		{
			System.out.println("check box is selected");
		}
		else
		{
			System.out.println("check box is not selected");

		}
		//table count
		List<WebElement> row = driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div/div[3]/div[1]/fieldset/table/tbody/tr"));
		System.out.println("row" +row.size());
		
		int rowsize = row.size();
		
		List<WebElement> colum = driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div/div[3]/div[1]/fieldset/table/tbody/tr[2]/td"));
		System.out.println("column" +colum.size());
		int columsize = colum.size();
		
		
		driver.findElement(By.xpath("//input[@id='bmwcheck']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		//new page
		
		//driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		
		//Thread.sleep(2000);
		//new tab
		//driver.findElement(By.xpath("//a[@id='opentab']")).click();
		
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
		 Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='show-textbox']")).click();

		
				
			JavascriptExecutor js=(JavascriptExecutor) driver;
			for(int i=0;i<3;i++)
			{
				js.executeScript("window.scrollBy(0, 100)");
				Thread.sleep(2000);
			}
			
			WebElement mouse = driver.findElement(By.xpath("//button[@id='mousehover']"));
			Actions act=new Actions(driver);
			act.moveToElement(mouse).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[.='Top']")).click();
			Thread.sleep(2000);

			
			
			JavascriptExecutor js1=(JavascriptExecutor) driver;
			for(int i=0;i<3;i++)
			{
				js1.executeScript("window.scrollBy(0, -200)");
				Thread.sleep(2000);
			}
			JavascriptExecutor js2=(JavascriptExecutor) driver;
			for(int i=0;i<3;i++)
			{
				js.executeScript("window.scrollBy(0, 200)");
				Thread.sleep(2000);
			}
			
			//iframe
			driver.switchTo().frame("courses-iframe");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[.='HOME']")).click();
			Thread.sleep(2000);

			driver.navigate().back();
			
			driver.switchTo().frame("courses-iframe");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='img-responsive']")).click();
			Thread.sleep(2000);
			for(int i=0;i<3;i++)
			{
				js.executeScript("window.scrollBy(0, 300)");
				Thread.sleep(2000);
			}
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.switchTo().frame("courses-iframe");

			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("software testing");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
			driver.navigate().refresh();
			Thread.sleep(2000);
			for(int i=0;i<3;i++)
			{
				js.executeScript("window.scrollBy(0, -500)");
				Thread.sleep(2000);
			}
			//sighn in
			
			driver.switchTo().frame("courses-iframe");
			driver.findElement(By.xpath("//a[.='Sign In']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bhanurukmangada@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("bhanunithish@3030");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			
			//drop down
			driver.switchTo().frame("courses-iframe");
			WebElement drop4 = driver.findElement(By.name("categories"));
			Thread.sleep(2000);
			Select s2=new Select(drop4);
			
			s2.selectByValue("1605");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//h4[@class='dynamic-heading']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			
			
			
			
			
			
			
			//new tab
			driver.findElement(By.xpath("//a[@id='opentab']")).click();
			driver.close();


			
			
			

			
				
			

			
		

		
		
		
		
		
		

	}

}
