package seleniumTests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumTests.AbstractPageObject;

public class HomePage extends AbstractPageObject{

	@FindBy(xpath = "html/body/div[2]/div/div/div/p[1]/a")
	private WebElement booksDialog;
	@FindBy(xpath = "html/body/div[2]/div/div/div/p[2]/a")
	private WebElement authorsDialog;
	
	// z paska
	@FindBy(xpath = "html/body/div[1]/div/div[2]/ul/li[1]/a")
	private WebElement booksNavbar;
	@FindBy(xpath = "html/body/div[1]/div/div[2]/ul/li[2]/a")
	private WebElement authorsNavbar;

	@FindBy(xpath = "html/body/div[2]/div/div/div/p[2]/a")
	private WebElement dialogA;
	@FindBy(xpath = "html/body/div[2]/div/div/div/p[2]/a")
	private WebElement dialogB;
	
	@FindBy(xpath = "html/body/div[1]/div/div[2]/ul/li[3]/a")
	private WebElement dialogANavbar;
	@FindBy(xpath = "html/body/div[1]/div/div[2]/ul/li[4]/a")
	private WebElement dialogBNavbar;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver.get("http://localhost:9001/#/main/welcome");
	}
	
	public BookListPage clickBookDialog(){
		booksDialog.click();
		return PageFactory.initElements(driver, BookListPage.class);
	}
	
	public BookListPage clickBookNavbar(){
		booksNavbar.click();
		return PageFactory.initElements(driver, BookListPage.class);
	}
		
	public AuthorsListPage clickAuthorsDialog(){
		authorsDialog.click();
		return PageFactory.initElements(driver, AuthorsListPage.class);
	}
	
	public AuthorsListPage clickAuthorsNavbar(){
		authorsNavbar.click();
		return PageFactory.initElements(driver, AuthorsListPage.class);
	}	
		
}