package org.test;

import java.io.IOException;

public class AdactinSampleClass extends AdactinBaseClassfromSuriya {

public static void main(String[] args) throws IOException {
		
		browserLaunch("CHROME");
		
		implicitlyWait(20);
		urlLaunch("https://adactinhotelapp.com/");
		 
	AdactinLogin a=new AdactinLogin();
	
//	sendKeys(a.getTxtusername(), "lokeshwaran02");
//	sendKeys(a.getTxtpassword(), "123456789");
	sendKeys(a.getTxtusername(), Excel("datadrivenExcel", "Sheet1", 5, 1));
     sendKeys(a.getTxtpassword(),Excel("datadrivenExcel", "Sheet1", 6, 1));
	
	click(a.getLogin());
	
	selectByIndex(a.getLocation(),2);
	selectByIndex(a.getHotels(), 0);
	selectByIndex(a.getRometype(), 0);
	selectByIndex(a.getRoomnumber(), 1);
	
	
	clear(a.getDatechoose());
	//sendKeys(a.getDatechoose(), "03/07/2023");
	sendKeys(a.getDatechoose(),Excel("datadrivenExcel", "Sheet1", 7, 1));
	
	clear(a.getDateout());
	//sendKeys(a.getDateout(), "04/07/2023");
	sendKeys(a.getDateout(),Excel("datadrivenExcel", "Sheet1", 8, 1));
	
	selectByIndex(a.getAdultroom(), 2);
	selectByIndex(a.getChildroom(), 1);

	click(a.getSearch());
	click(a.getRadiobutton());
	click(a.getClickcontinuebutton());
	
//	sendKeys(a.getFirstname(), "Lenin");
//	sendKeys(a.getFullname(), "Lenin GT");
//	sendKeys(a.getBilladdres(), "padppai");
//	sendKeys(a.getCreditnumber(), "1234567891234567");
	
	sendKeys(a.getFirstname(),Excel("datadrivenExcel", "Sheet1", 9, 3));
	sendKeys(a.getFullname(),Excel("datadrivenExcel", "Sheet1", 10, 3));
	sendKeys(a.getBilladdres(),Excel("datadrivenExcel", "Sheet1", 11, 1));
	sendKeys(a.getCreditnumber(),Excel("datadrivenExcel", "Sheet1", 12, 1));
	
	
	selectByIndex(a.getCreditcardtype(), 2);
	
	selectByIndex(a.getExpiredmonth(), 1);
	//for loop here we can use.
	selectByIndex(a.getExpiredyear(), 16);
	
    //sendKeys(a.getcvvnumber(), "123");
	sendKeys(a.getcvvnumber(),Excel("datadrivenExcel", "Sheet2", 3, 3));
	
	click(a.getBookclick());
	
	
	System.out.println(a.getAttribute(a.getOrdernumberselect()));
	

	
	
	}

}


