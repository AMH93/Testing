import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroducereSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//Invoking Browser
	//chromedriver.exe -> Chrome browser
	System.setProperty("webdriver.chrome.driver", "E:\\Ana\\AnaH\\Curs Testare\\tools installer\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.undelucram.ro/login");
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.name("email")).sendKeys("ana@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"password-div\"]/input")).sendKeys("abcd");
	driver.findElement(By.id("undelucram_login_btn")).click();
	}

}
