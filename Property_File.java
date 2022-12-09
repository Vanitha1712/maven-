package com.maven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.properties.File_Reader_Manager;
import com.sdp.Page_Object_Manager_Main;

public class Property_File extends Base_Class{
	

	public static WebDriver driver = browserLaunching("chrome");
	
	public static Page_Object_Manager_Main pom = new Page_Object_Manager_Main(driver);
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getInstanceUrl();
	    getUrl(url);
	    
	    String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getInstanceUsername();
	    sendKeys(pom.getInstanceLogin().getUsername(), username);

	    String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getInstancePassword();
		sendKeys(pom.getInstanceLogin().getPassword(), password);

		clickOnElement(pom.getInstanceLogin().getLogin());
		
		indexSelect(pom.getInstanceSearch().getLocation(),5);
		
		indexSelect(pom.getInstanceSearch().getHotelName(),2);
		
		visibleTextSelect(pom.getInstanceSearch().getRoom(), "Standard");
		
		indexSelect(pom.getInstanceSearch().getNumberOfRooms(), 3);
		
		String checkIn = File_Reader_Manager.getInstanceFRM().getInstanceCR().getInstanceCheckIn();
		deleteInput(pom.getInstanceSearch().getCheckIn());
		sendKeys(pom.getInstanceSearch().getCheckIn(), checkIn);
		
		String checkOut = File_Reader_Manager.getInstanceFRM().getInstanceCR().getInstanceCheckOut();
		deleteInput(pom.getInstanceSearch().getCheckOut());
		sendKeys(pom.getInstanceSearch().getCheckOut(), checkOut);
		
		indexSelect(pom.getInstanceSearch().getAdultRoom(),  2);
		
		indexSelect(pom.getInstanceSearch().getChildRoom(), 1);
		
		clickOnElement(pom.getInstanceSearch().getSearch());
		
		clickOnElement(pom.getInstanceSelect().getSelect());
		
		clickOnElement(pom.getInstanceSelect().getContinueButton());
		
		String firstName = File_Reader_Manager.getInstanceFRM().getInstanceCR().getInstanceFirstName();
		sendKeys(pom.getInstanceBook().getFirstname(), firstName);
		
		String lastName = File_Reader_Manager.getInstanceFRM().getInstanceCR().getInstanceLastName();
		sendKeys(pom.getInstanceBook().getLastname(), lastName);
		
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getInstanceAddress();
		sendKeys(pom.getInstanceBook().getAddress(), address);
		
		String creditNo = File_Reader_Manager.getInstanceFRM().getInstanceCR().getInstanceCreditNo();
		sendKeys(pom.getInstanceBook().getCreditno(), creditNo);
		
		indexSelect(pom.getInstanceBook().getCardtype(), 2);
		
		indexSelect(pom.getInstanceBook().getExpmon(), 5);
		
		visibleTextSelect(pom.getInstanceBook().getExpyear(), "2014");
		
		String cv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getInstanceCv();
		sendKeys(pom.getInstanceBook().getCv(), cv);
		
		clickOnElement(pom.getInstanceBook().getBook());
		
		Thread.sleep(5000);
		String location = File_Reader_Manager.getInstanceFRM().getInstanceCR().getInstanceScreenshotLocation();
	    takesScreenshot(location);
		
	    Thread.sleep(6000);
		clickOnElement(pom.getInstanceLogOut().getLogout());
		
		Thread.sleep(1000);
		closeBrowser();
      }

}
