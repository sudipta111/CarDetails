package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CoverCheck_Page {
	
	private static WebElement element = null;

	public WebElement btn_FindVehicle(WebDriver driver) {

		element = driver.findElement(By.id("search"));

		return element;

	}
	public WebElement txtbx_CarRegNo(WebDriver driver) {

		element = driver.findElement(By.id("vehicleReg"));

		return element;

	}
	public WebElement ele_Result(WebDriver driver) {

		element = driver.findElement(By.className("result"));

		return element;

	}
	public WebElement ele_ErroRequired(WebDriver driver) {

		element = driver.findElement(By.className("error-required"));

		return element;

	}
	public WebElement ele_CoverSt(WebDriver driver) {
		List<WebElement> elementC = null;

		elementC = driver.findElements(By.cssSelector(".resultDate-bold .resultDate"));

		return elementC.get(0);

	}
}
