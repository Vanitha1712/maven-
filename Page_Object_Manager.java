package com.maven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pom.Book_Hotel;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;
import com.sdp.Page_Object_Manager_Main;

public class Page_Object_Manager extends Base_Class {

	public static WebDriver driver = browserLaunching("chrome");
	
	public static Page_Object_Manager_Main pom = new Page_Object_Manager_Main(driver);
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
	    getUrl("https://adactinhotelapp.com/");
	    
	    sendKeys(pom.getInstanceLogin().getUsername(), "vanitha1712");

		sendKeys(pom.getInstanceLogin().getPassword(), "vani1712");

		clickOnElement(pom.getInstanceLogin().getLogin());
		
		indexSelect(pom.getInstanceSearch().getLocation(),5);
		
		indexSelect(pom.getInstanceSearch().getHotelName(),2);
		
		visibleTextSelect(pom.getInstanceSearch().getRoom(), "Standard");
		
		indexSelect(pom.getInstanceSearch().getNumberOfRooms(), 3);
		
		deleteInput(pom.getInstanceSearch().getCheckIn());
		sendKeys(pom.getInstanceSearch().getCheckIn(), "10/10/2023");
		
		deleteInput(pom.getInstanceSearch().getCheckOut());
		sendKeys(pom.getInstanceSearch().getCheckOut(), "15/10/2023");
		
		indexSelect(pom.getInstanceSearch().getAdultRoom(),  2);
		
		indexSelect(pom.getInstanceSearch().getChildRoom(), 1);
		
		clickOnElement(pom.getInstanceSearch().getSearch());
		
		clickOnElement(pom.getInstanceSelect().getSelect());
		
		clickOnElement(pom.getInstanceSelect().getContinueButton());
		
		sendKeys(pom.getInstanceBook().getFirstname(), "vanitha");
		
		sendKeys(pom.getInstanceBook().getLastname(), "S");
		
		sendKeys(pom.getInstanceBook().getAddress(), "3,venkateshwara nagar,chennai");
		
		sendKeys(pom.getInstanceBook().getCreditno(), "1234567891234567");
		
		indexSelect(pom.getInstanceBook().getCardtype(), 2);
		
		indexSelect(pom.getInstanceBook().getExpmon(), 5);
		
		visibleTextSelect(pom.getInstanceBook().getExpyear(), "2014");
		
		sendKeys(pom.getInstanceBook().getCv(), "7653");
		
		clickOnElement(pom.getInstanceBook().getBook());
		
		Thread.sleep(5000);
	    takesScreenshot("C:\\Users\\TESTUSER\\eclipse-workspace\\maven\\Screenshot//adactinHotel.png");
		
	    Thread.sleep(6000);
		clickOnElement(pom.getInstanceLogOut().getLogout());
		
		Thread.sleep(1000);
		closeBrowser();
      }

}
