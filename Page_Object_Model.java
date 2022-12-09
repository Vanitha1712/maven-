package com.maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pom.Book_Hotel;
import com.pom.LogOut_Page;
import com.pom.Login_Page;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

public class Page_Object_Model extends Base_Class {

public static void main(String[] args) throws InterruptedException, IOException {
			
	    browserLaunching("chrome");
		
	    getUrl("https://adactinhotelapp.com/");
		
	    Login_Page lp = new Login_Page(driver);
	    
	    sendKeys(lp.getUsername() , "vanitha1712");

		sendKeys(lp.getPassword(), "vani1712");

		clickOnElement(lp.getLogin());
		
		Search_Hotel sh = new Search_Hotel(driver);
		
		indexSelect(sh.getLocation(),5);
		
		indexSelect(sh.getHotelName(),2);
		
		visibleTextSelect(sh.getRoom(), "Standard");
		
		indexSelect(sh.getNumberOfRooms(), 3);
		
		deleteInput(sh.getCheckIn());
		sendKeys(sh.getCheckIn(), "10/10/2023");
		
		deleteInput(sh.getCheckOut());
		sendKeys(sh.getCheckOut(), "15/10/2023");
		
		indexSelect(sh.getAdultRoom(),  2);
		
		indexSelect(sh.getChildRoom(), 1);
		
		clickOnElement(sh.getSearch());
		
		Select_Hotel sel = new Select_Hotel(driver);
		
		clickOnElement(sel.getSelect());
		
		clickOnElement(sel.getContinueButton());
		
		Book_Hotel bh = new Book_Hotel(driver);
		
		sendKeys(bh.getFirstname(), "vanitha");
		
		sendKeys(bh.getLastname(), "S");
		
		sendKeys(bh.getAddress(), "3,venkateshwara nagar,chennai");
		
		sendKeys(bh.getCreditno(), "1234567891234567");
		
		indexSelect(bh.getCardtype(), 2);
		
		indexSelect(bh.getExpmon(), 5);
		
		visibleTextSelect(bh.getExpyear(), "2014");
		
		sendKeys(bh.getCv(), "7653");
		
		clickOnElement(bh.getBook());
		
		Thread.sleep(5000);
	    takesScreenshot("C:\\Users\\TESTUSER\\eclipse-workspace\\maven\\Screenshot//adactinHotel.png");
		
	    LogOut_Page lop = new LogOut_Page(driver);
	    Thread.sleep(6000);
		clickOnElement(lop.getLogout());
		
		Thread.sleep(1000);
		closeBrowser();
      }

}
