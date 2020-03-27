package web.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseActions {

	protected WebDriver driver;

	protected WebDriverWait wait;

	public BaseActions(WebDriver driver) {
		this.driver = driver;
	}

	public void setWait(int time) {
		this.driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
}
