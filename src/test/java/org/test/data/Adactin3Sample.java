package org.test.data;

import org.test.AdactinLogin;

public class Adactin3Sample extends Adactin3basesSuriya{


public static void main(String[] args) {
		
		browserLaunch("chrome");
		
		implicitlyWait(20);
//		urlLaunch("https://adactinhotelapp.com/");
		urlLaunch("https://adactinhotelapp.com/");
		 
	AdactinLogin a=new AdactinLogin();
	
	sendKeys(a.getTxtusername(), "lokeshwaran10");
	sendKeys(a.getTxtpassword(), "123456789");
	
	click(a.getLogin());
	
	selectByIndex(a.getLocation(),2);
	selectByIndex(a.getHotels(), 0);
	selectByIndex(a.getRometype(), 0);
	selectByIndex(a.getRoomnumber(), 1);
	
	
	clear(a.getDatechoose());
	sendKeys(a.getDatechoose(), "03/07/2023");
	clear(a.getDateout());
	sendKeys(a.getDateout(), "04/07/2023");
	
	selectByIndex(a.getAdultroom(), 2);
	selectByIndex(a.getChildroom(), 1);

	
	click(a.getSearch());
	click(a.getRadiobutton());
	click(a.getClickcontinuebutton());
	
	sendKeys(a.getFirstname(), "Lenin");
	sendKeys(a.getFullname(), "Lenin GT");
	sendKeys(a.getBilladdres(), "padppai");
	sendKeys(a.getCreditnumber(), "1234567891234567");
	
	selectByIndex(a.getCreditcardtype(), 2);
	
	selectByIndex(a.getExpiredmonth(), 1);
	//for loop here we can use.
	selectByIndex(a.getExpiredyear(), 16);
	
    sendKeys(a.getcvvnumber(), "123");
	
	click(a.getBookclick());
	
	
//	System.out.println(a.getAttribute(a.getOrdernumberselect()));
	

	
	
	}

}