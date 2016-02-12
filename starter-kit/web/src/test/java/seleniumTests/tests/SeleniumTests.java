package seleniumTests.tests;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import seleniumTests.AbstractSelenium;
import seleniumTests.pages.HomePage;

public class SeleniumTests extends AbstractSelenium {

	private HomePage homePage;	
	
	@Override
	@Before
	public void setUp() {
		super.setUp();
		homePage = openHomePage();
	}

	@Test
	public void shouldOpenPage() {
		homePage = openHomePage();
		assertFalse(homePage.hasError());
	}
	
	@Test
	public void shouldClickBookDialog() {
		homePage.clickBookDialog();
		assertFalse(homePage.hasError());
	}

	@Test
	public void shouldClickBookNavbar() {
		homePage.clickBookNavbar();
		assertFalse(homePage.hasError());
	}

	@Test
	public void shouldClickAuthorsDialog() {
		homePage.clickAuthorsDialog();
		assertFalse(homePage.hasError());
	}

	@Test
	public void shouldClickAuthorsNavbar() {
		homePage.clickAuthorsNavbar();
		assertFalse(homePage.hasError());
	}
}
