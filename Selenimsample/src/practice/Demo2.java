package practice;


import java.awt.List;



import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//drop down button
		WebElement ele=driver.findElement(By.id("multiselect1"));
			//org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(ele);
		Select s=new Select(ele);
			s.selectByIndex(0);
			Thread.sleep(2000);
			s.selectByValue("audix");
			Thread.sleep(2000);
			
			
			//text field
			driver.findElement(By.id("ta1")).sendKeys("hii.. iam bhanu");
			Thread.sleep(2000);
			
			//single drop down
			WebElement ele1=driver.findElement(By.name("SiteMap"));
			Select s1=new Select(ele1);
			s1.selectByValue("def");
			Thread.sleep(2000);
			
			s1.selectByVisibleText("doc 1");
			Thread.sleep(2000);
			
			s1.selectByIndex(2);
			Thread.sleep(2000);
			
			//scroll bar
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			for(int i=0;i<3;i++)
			{
				js.executeScript("window.scrollBy(0, 100)");
				Thread.sleep(2000);
			}
			
			//clear text 
			driver.findElement(By.name("fname")).clear();
			Thread.sleep(2000);
			
			//link
			driver.findElement(By.id("link1")).click();
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			//radio button
			WebElement radio1=driver.findElement(By.id("radio2"));
			radio1.click();
			System.out.println(radio1.isSelected());
			Thread.sleep(2000);
			
			//scroll bar
			JavascriptExecutor js1=(JavascriptExecutor) driver;
			for(int i=0;i<3;i++)
			{
				js1.executeScript("window.scrollBy(0, 100)");
				Thread.sleep(2000);
			}
			
			//disabled text field
			JavascriptExecutor js2=(JavascriptExecutor) driver;
			js.executeScript("document.getElementById('tb2').value='bhanu'");
			Thread.sleep(2000);
			
			
			//alert message
			driver.findElement(By.xpath("//input[@id='alert1']")).click();
			Thread.sleep(2000);
			Alert a=driver.switchTo().alert();
			String text=a.getText();
			a.dismiss();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='prompt']")).click();
			Thread.sleep(2000);
			
			Alert a1=driver.switchTo().alert();
			String text1=a.getText();
			System.out.println("bhanu");
			a1.accept();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='confirm']")).click();
			Thread.sleep(2000);
			Alert a2=driver.switchTo().alert();
			String text2=a.getText();
			a2.accept();
			Thread.sleep(2000);
			
			
			//handle Synchronisation method
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bhanu");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("bhanu3030");
			driver.findElement(By.xpath("//button[@value='LogIn']")).click();
		
			Thread.sleep(2000);
		
			JavascriptExecutor js3=(JavascriptExecutor) driver;
			for(int i=0;i<3;i++)
			{
				js3.executeScript("window.scrollBy(0, 300)");
				Thread.sleep(2000);
			}
			driver.findElement(By.xpath("//input[@value='Bike']")).click();

			Thread.sleep(2000);
			
			//multiple checkbox
			
			driver.findElement(By.xpath("//input[@value='Book']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='Laptop']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='Bag']")).click();
			Thread.sleep(2000);


			
			
			//double click action
			WebElement eble = driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));
			Actions act=new Actions(driver);
			act.doubleClick(eble).perform();
			Thread.sleep(2000);
			Alert alt=driver.switchTo().alert();
			alt.accept();
			Thread.sleep(2000);
	
			WebElement eble1 = driver.findElement(By.xpath("//p[text()='Double-click']"));
			Actions act1=new Actions(driver);
			act.doubleClick(eble1).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Facebook']")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			
			Thread.sleep(2000);
			//File upload
			WebElement ele3 = driver.findElement(By.xpath("//input[@id='uploadfile']"));
			ele3.sendKeys("C://Users//Dunn//Documents//Snagit");
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//button[.='Try it']")).click();
			
			Thread.sleep(2000);
			 driver.findElement(By.xpath("//button[.='Check this']")).click();
			
			
			 JavascriptExecutor js6=(JavascriptExecutor) driver;
				for(int i=0;i<3;i++)
				{
					js1.executeScript("window.scrollBy(0, -600)");
					Thread.sleep(2000);
				}
				Thread.sleep(2000);
				
				//Mouse over action
				
				WebElement ele5=driver.findElement(By.xpath("//span[@id='blogsmenu']"));
				Actions act4=new Actions(driver);
				act4.moveToElement(ele5).perform();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//span[.='SeleniumByArun']")).click();
				Thread.sleep(2000);
				
				JavascriptExecutor js5=(JavascriptExecutor) driver;
				for(int i=0;i<3;i++)
				{
					js6.executeScript("window.scrollBy(0, 600)");
					Thread.sleep(2000);
				}
				
				JavascriptExecutor js7=(JavascriptExecutor) driver;
				for(int i=0;i<3;i++)
				{
					js7.executeScript("window.scrollBy(0, -600)");
					Thread.sleep(2000);
				}
				
				
				driver.navigate().back();
				
				//Search context
				driver.findElement(By.xpath("//input[@class='gsc-input']")).sendKeys("bhanu");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='gsc-search-button']")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@value='orange']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@value='blue']")).click();
				Thread.sleep(2000);
				String title = driver.getTitle();
				System.out.println(title);
				String url = driver.getCurrentUrl();
				
				System.out.println(url);

				//WebElement tabl1 = driver.findElement(By.id("table1"));
				//driver.switchTo().frame(tabl1);
				

 
		
			
			
		
			
	
		
		
	}

}
