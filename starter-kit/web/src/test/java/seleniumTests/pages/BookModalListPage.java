package seleniumTests.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumTests.AbstractPageObject;

public class BookModalListPage extends AbstractPageObject {

	@FindBy(xpath = "html/body/div[4]/div/div/div/form/div[3]/button")
	private WebElement closeButton;

	@FindBy(name = "books")
	private List<WebElement> books;

	public BookModalListPage(WebDriver driver) {
		super(driver);
	}

	public BookListPage close() {
		
		closeButton.click();
		return PageFactory.initElements(driver, BookListPage.class);
	}

	
	
}
