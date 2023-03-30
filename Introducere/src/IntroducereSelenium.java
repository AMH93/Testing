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
	driver.findElement(By.name("email")).sendKeys("hmnanamaria@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"password-div\"]/input")).sendKeys("Doneaana20!");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[1]/div/div/form/div[1]/div[4]/input")).click();
	}

}
