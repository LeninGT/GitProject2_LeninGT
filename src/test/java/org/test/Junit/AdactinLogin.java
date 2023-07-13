package org.test.Junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogin extends AdactinBaseClassfromSuriya {
	public AdactinLogin() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(id="username")
		private WebElement txtusername;
		@FindBy(id="password")
		private WebElement txtpassword;
	    @FindBy(id="login")
	    private WebElement login;
	    @FindBy(id="location")
	    private WebElement  location;
	    @FindBy(id="hotels")
	    private WebElement hotels;
	    @FindBy(id="room_type")
	    private WebElement rometype;
        @FindBy(id="room_nos")
	    private WebElement roomnumber;
	    @FindBy(id="datepick_in")
	    private WebElement datechoose;
	    @FindBy(id="datepick_out")
         private WebElement dateout;
	    @FindBy(id="adult_room")
	    private WebElement adultroom;
	    @FindBy(id="child_room")
	    private WebElement childroom;
	    @FindBy(id="Submit")
	    private WebElement search;
	    @FindBy(id="radiobutton_1")
         private WebElement radiobutton;
	    @FindBy(id="continue")
	    private WebElement clickcontinuebutton;
	    @FindBy(id="first_name")
		private WebElement firstname;
		@FindBy(id="last_name")
		private WebElement fullname;
	    @FindBy(id="address")
	    private WebElement billaddres;
	    @FindBy(id="cc_num")
	    private WebElement  creditnumber;
	    @FindBy(id="cc_type")
	    private WebElement  creditcardtype;
	    @FindBy(id="cc_exp_month")
	    private WebElement  expiredmonth;
	    @FindBy(id="cc_exp_year")
	    private WebElement  expiredyear;
	    @FindBy(id="cc_cvv")
	    private WebElement cvvnumber;
	    @FindBy(id="book_now")
	    private WebElement Bookclick;
	    @FindBy(id="order_no")
	    private WebElement Ordernumberselect;
	    
	    
	    
	    
		public WebElement getTxtusername() {
			return txtusername;
		}
		public WebElement getTxtpassword() {
			return txtpassword;
		}
		public WebElement getLogin() {
			return login;
		}
		public WebElement getLocation() {
			return location;
		}
		public WebElement getHotels() {
			return hotels;
		}
		public WebElement getRometype() {
			return rometype;
		}
		public WebElement getRoomnumber() {
			return roomnumber;
		}
		public WebElement getDatechoose() {
			return datechoose;
		}
		public WebElement getDateout() {
			return dateout;
		}
		public WebElement getAdultroom() {
			return adultroom;
		}
		public WebElement getChildroom() {
			return childroom;
		}
		public WebElement getSearch() {
			return search;
		}
		public WebElement getRadiobutton() {
			return radiobutton;
		}
		public WebElement getClickcontinuebutton() {
			return clickcontinuebutton;
		}
		public WebElement getFirstname() {
			return firstname;
		}
		public WebElement getFullname() {
			return fullname;
		}
		public WebElement getBilladdres() {
			return billaddres;
		}
		public WebElement getCreditnumber() {
			return creditnumber;
		}
		public WebElement getCreditcardtype() {
			return creditcardtype;
		}
		public WebElement getExpiredmonth() {
			return expiredmonth;
		}
		public WebElement getExpiredyear() {
			return expiredyear;
		}
		public WebElement getcvvnumber() {
			return cvvnumber;
		}
		public WebElement getBookclick() {
			return Bookclick;
		}
		public WebElement getOrdernumberselect() {
			return Ordernumberselect;
}
}

	 