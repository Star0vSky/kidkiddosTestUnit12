import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.BooksResultPage;
import pages.HomePage;
import pages.LoginPage;
import utils.UseCaseBase;
import static org.junit.jupiter.api.Assertions.*;


public class HomePageTest extends UseCaseBase {
    private static HomePage homePage;

    @BeforeAll
    public static void classSetup() {
        homePage = new HomePage();
    }

    @BeforeEach
    public void beforeTest() {
        homePage.navigateToHomePage();
    }


    @Test
    public void homePageLoadedTest() {
        Boolean success = homePage.isLogoVisible();
        assertTrue(success);
    }

    @Test
    public void openLoginPage() {
        LoginPage loginPage = homePage.openLoginIcon();
        boolean isLoaded = loginPage.isLoginPageVisible();
        assertTrue(isLoaded);

    }

    @Test
    public void selectEnglishOnlyPage() {
        BooksResultPage booksResultPage = homePage.openBooksByLanguage();
        boolean isLoaded = booksResultPage.isEnglishOnlyVisible();
        assertTrue(isLoaded);
    }


}
