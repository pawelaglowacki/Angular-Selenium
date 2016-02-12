package seleniumTests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumTests.AbstractPageObject;

public class AuthorsListPage extends AbstractPageObject {

	@FindBy(xpath = "html/body/div[2]/div/section/button")
	private WebElement searchButton;
	@FindBy(xpath = "html/body/div[2]/div/section/input")
	private WebElement searchInput;
	
	public AuthorsListPage(WebDriver driver) {
		super(driver);
	}

	public AuthorsListPage searchAuthor(String authorName) {
		searchInput.sendKeys(authorName);
		searchButton.submit();
		return PageFactory.initElements(driver, AuthorsListPage.class);		
	}

}