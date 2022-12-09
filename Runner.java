package com.maven;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Runner extends Base_Class{

public static void main(String[] args) throws InterruptedException, IOException {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TESTUSER\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
//	
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
	
	    browserLaunching("chrome");
	
		
//		driver.get("https://adactinhotelapp.com/");
	    
	    getUrl("https://adactinhotelapp.com/");
		
	    
		WebElement username = driver.findElement(By.id("username"));
//		username.sendKeys("vanitha1712");
		sendKeys(username , "vanitha1712");
	        
		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("vani1712");
		sendKeys(password, "vani1712");

		WebElement login = driver.findElement(By.id("login"));
//		login.click();
		clickOnElement(login);
		
		WebElement location = driver.findElement(By.id("location"));
//		Select s = new Select(location);
//		s.selectByIndex(5);
		indexSelect(location,5);
		
		WebElement hotelName = driver.findElement(By.id("hotels"));
//		Select s1 = new Select(hotelName);
//		s1.selectByIndex(2);
		indexSelect(hotelName,2);
		
		WebElement room = driver.findElement(By.id("room_type"));
//		Select s2 = new Select(room);
//		s2.selectByVisibleText("Standard");
		visibleTextSelect(room, "Standard");
		
		WebElement numberOfRooms = driver.findElement(By.id("room_nos"));
//		Select s3 = new Select(numberOfRooms);
//		s3.selectByIndex(3);
		indexSelect(numberOfRooms, 3);
		
		WebElement checkIn = driver.findElement(By.id("datepick_in"));
//		checkIn.clear();
		deleteInput(checkIn);
//		checkIn.sendKeys("10/10/2023");
		sendKeys(checkIn, "10/10/2023");
		
		WebElement checkOut = driver.findElement(By.id("datepick_out"));
//		checkOut.clear();
		deleteInput(checkOut);
//		checkOut.sendKeys("15/10/2023");
		sendKeys(checkOut, "15/10/2023");
		
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
//		Select s4 = new Select(adultRoom);
//		s4.selectByIndex(2);
		indexSelect(adultRoom,  2);
		
		WebElement childRoom = driver.findElement(By.id("child_room"));
//		Select s5 = new Select(childRoom);
//		s5.selectByIndex(1);
		indexSelect(childRoom, 1);
		
		WebElement search = driver.findElement(By.id("Submit"));
//		search.click();
		clickOnElement(search);
		
		WebElement select = driver.findElement(By.id("radiobutton_0"));
//		select.click();
		clickOnElement(select);
		
		WebElement continueButton = driver.findElement(By.id("continue"));
//		continueButton.click();
		clickOnElement(continueButton);
		
		WebElement firstname = driver.findElement(By.id("first_name"));
//		firstname.sendKeys("vanitha");
		sendKeys(firstname, "vanitha");
		
		WebElement lastname = driver.findElement(By.name("last_name"));
//		lastname.sendKeys("S");
		sendKeys(lastname, "S");
		
		WebElement address = driver.findElement(By.id("address"));
//		address.sendKeys("3,venkateshwara nagar,chennai");
		sendKeys(address, "3,venkateshwara nagar,chennai");
		
		WebElement creditno = driver.findElement(By.id("cc_num"));
//		creditno.sendKeys("1234567891234567");
		sendKeys(creditno, "1234567891234567");
		
		WebElement cardtype = driver.findElement(By.id("cc_type"));
//		Select s6 = new Select(cardtype);
//		s6.selectByIndex(2);
		indexSelect(cardtype, 2);
		
		WebElement expmon = driver.findElement(By.id("cc_exp_month"));
//		Select s7 = new Select(expmon);
//		s7.selectByIndex(5);
		indexSelect(expmon, 5);
		
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
//		Select s8 = new Select(expyear);
//		s8.selectByVisibleText("2014");
		visibleTextSelect(expyear, "2014");
		
		WebElement cv = driver.findElement(By.id("cc_cvv"));
//		cv.sendKeys("7653");
		sendKeys(cv, "7653");
		
		WebElement book = driver.findElement(By.id("book_now"));
//		book.click();
		clickOnElement(book);
	
		Thread.sleep(5000);
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\eclipse-workspace\\Maven\\ScreenShot//adactinHotel.png");
//		FileUtils.copyFile(source, destination);
	    takesScreenshot("C:\\Users\\TESTUSER\\eclipse-workspace\\maven\\Screenshot//adactinHotel.png");
		
		Thread.sleep(6000);
		WebElement logout = driver.findElement(By.id("logout"));
//		logout.click();
		clickOnElement(logout);
		
		Thread.sleep(1000);
		closeBrowser();
      }
		
	}

