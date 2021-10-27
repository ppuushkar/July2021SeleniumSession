package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Piyush Puushkar\\Downloads\\chromedriver_win32\\chromedriver.exe")   ; 
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		
		String title =driver.getTitle();
		System.out.println(" Page Title is " + " :: " + title);
		
		// Verification code
		if(title.equals("Google")) {
			System.out.println("Yes the Title Matches");
		}
		else {
			System.out.println("Wrong Title");
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
	}

}
