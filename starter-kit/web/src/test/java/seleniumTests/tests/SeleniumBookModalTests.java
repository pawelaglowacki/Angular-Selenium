package seleniumTests.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Verify;

import seleniumTests.AbstractSelenium;
import seleniumTests.pages.BookListPage;
import seleniumTests.pages.BookModalListPage;
import seleniumTests.pages.HomePage;

public class SeleniumBookModalTests extends AbstractSelenium {

	private HomePage homePage;
	private BookListPage bookPage;
	private BookModalListPage bookModalPage;
	
	@Override
	@Before
	public void setUp() {
		super.setUp();
		homePage = openHomePage();
		bookPage = homePage.clickBookDialog();
		bookModalPage = bookPage.clickAddBook();
	}

	@Test
	public void shouldOpenPage() {
		assertFalse(bookModalPage.hasError());
	}
}