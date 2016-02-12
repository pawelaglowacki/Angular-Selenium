package seleniumTests.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import seleniumTests.AbstractSelenium;
import seleniumTests.pages.BookListPage;
import seleniumTests.pages.HomePage;

public class SeleniumBookTests extends AbstractSelenium {

	private HomePage homePage;
	private BookListPage bookPage;
	
	@Override
	@Before
	public void setUp() {
		super.setUp();
		homePage = openHomePage();
		bookPage = homePage.clickBookDialog();
	}

	@Test
	public void shouldOpenPage() {
		assertFalse(bookPage.hasError());
	}
	
	@Test
	public void shouldGetProperNumberOfBooks() {
		int numberOfBooks = bookPage.getNumberOfShownBooks();
		assertEquals(numberOfBooks,0);
	}
	
	@Test
	public void shouldAddBook() {
		bookPage.addBook("Jakis tytul");
		assertFalse(bookPage.hasError());
	}

	@Test
	public void shouldSearchBook() {
		bookPage.searchBookByTitle("niematakiejksiazki");
		assertTrue(bookPage.hasError());
	}


	@Test
	public void shouldClickBookNavbar() {
		homePage.clickBookNavbar();
		assertFalse(homePage.hasError());
	}

	@Test
	public void shouldClickAuthorsNavbar() {
		homePage.clickAuthorsNavbar();
		assertFalse(homePage.hasError());
	}
}