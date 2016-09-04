package jenkinsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testFile {

	public static void main(String[] args) {
		WebDriver wd=new FirefoxDriver();
		wd.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/2.53.1");
	}
}
