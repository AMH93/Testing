import org.openqa.selenium.chrome.ChromeDriver;

public class IntroducereSelenium2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//Invoking Browser
	//chromedriver.exe -> Chrome browser
	System.setProperty("webdriver.chrome.driver", "E:\\Ana\\AnaH\\Curs Testare\\tools installer\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.instagram.com/");
	System.out.println(driver.getCurrentUrl());
	driver.close();
	
	}

}