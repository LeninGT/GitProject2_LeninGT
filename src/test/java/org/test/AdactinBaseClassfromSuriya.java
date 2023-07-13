package org.test;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AdactinBaseClassfromSuriya {
	
	public static WebDriver driver;

	public static WebDriver chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		return driver = new ChromeDriver();

	}
//IF 
	public static WebDriver browserLaunch(String bname) {
		if (bname.equalsIgnoreCase("CHrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (bname.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (bname.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		return driver;

	}

	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}

	public static void implicitlyWait(int a) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
	}

	public static void sendKeys(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void click(WebElement e) {
		e.click();
	}

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String getText(WebElement e) {
		String text = e.getText();
		return text;
	}

	public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;

	}

	public static void movetoElement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}

	public static void dragAndDrop(WebElement src, WebElement tar) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, tar).perform();
	}

	public static void selectByIndex(WebElement e, int a) {
		Select s = new Select(e);
		s.selectByIndex(a);
		

	}

	public static void keyAction() throws Exception {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_BACK_SPACE);

	}

	public static void clear(WebElement e) {
		e.clear();
	}
	
	public static String Excel(String filename,String sheet,int R,int C) throws IOException {
		File F=new File("C:\\Users\\lenovo\\eclipse-workspace\\Maven2023Project\\src\\test\\resources\\Excel\\"+filename+".xlsx");
		FileInputStream st=new FileInputStream(F);
		Workbook w=new XSSFWorkbook(st);
		Sheet s = w.getSheet(sheet);
	    Row r = s.getRow(R);
		Cell cell = r.getCell(C);
		int cellType = cell.getCellType();
		String value=null;
		 //Base Class dont allow Sysout
		 
		 // TYPE 1 STRING
		 //TYPE 0 NUMBER DATE
		 
		if(cellType==1) {
		  value=cell.getStringCellValue();
		}
		else {
			if(DateUtil.isCellDateFormatted(cell)) {
			
			Date datavalue=cell.getDateCellValue();
			//date to string covertion
			SimpleDateFormat df=new SimpleDateFormat("dd-mm-yyyy");
			 value = df.format(datavalue);
		
		}
		else {
			double numericCellValue = cell.getNumericCellValue();
			//typecaSTING
			long num=(long)numericCellValue;
			 value= String.valueOf(num);
					
		}
		
	}
		return value;
		
	
}
}
