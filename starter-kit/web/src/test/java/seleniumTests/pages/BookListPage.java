package seleniumTests.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumTests.AbstractPageObject;

public class BookListPage extends AbstractPageObject {

	@FindBy(xpath = "html/body/div[2]/div/section/button[2]")
	private WebElement addButton;
	@FindBy(xpath = "html/body/div[2]/div/section/button[1]")
	private WebElement searchButton;
	@FindBy(xpath = "html/body/div[2]/div/section/input")
	private WebElement titleInput;

	@FindBy(name = "books")
	private List<WebElement> books;

	public BookListPage(WebDriver driver) {
		super(driver);
	}

	public BookListPage searchBookByTitle(String title) {

		titleInput.sendKeys(title);
		searchButton.submit();
		return PageFactory.initElements(driver, BookListPage.class);
	}

	public BookListPage addBook(String title) {
		
		titleInput.sendKeys(title);
		addButton.submit();
		return PageFactory.initElements(driver, BookListPage.class);
	}

	public BookModalListPage clickAddBook() {
		
		addButton.submit();
		return PageFactory.initElements(driver, BookModalListPage.class);
	}
	
	public Integer getNumberOfShownBooks() {
		return books.size();
	}

}
