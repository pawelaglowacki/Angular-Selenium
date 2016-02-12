package seleniumTests.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import seleniumTests.AbstractSelenium;
import seleniumTests.pages.AuthorsListPage;
import seleniumTests.pages.BookListPage;
import seleniumTests.pages.HomePage;

public class SeleniumAuthorsTests extends AbstractSelenium {

	private HomePage homePage;
	private AuthorsListPage authorsPage;
	
	@Override
	@Before
	public void setUp() {
		super.setUp();
		homePage = openHomePage();
		authorsPage = homePage.clickAuthorsDialog();
	}

	@Test
	public void shouldOpenPage() {
		authorsPage = homePage.clickAuthorsDialog();
		assertFalse(authorsPage.hasError());
	}
	
	@Test
	public void shouldSearchAuthor() {
		authorsPage.searchAuthor("niematakiegoautora");
		assertTrue(authorsPage.hasError());
	}
}