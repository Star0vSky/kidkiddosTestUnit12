import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import utils.UseCaseBase;
import static org.junit.jupiter.api.Assertions.*;


public class LoginPageTest extends UseCaseBase{

    private static LoginPage loginPage;

    @BeforeAll
    public static void classSetup() {
        loginPage = new LoginPage();
    }

    @BeforeEach
    public void beforeTest() {
        loginPage.navigateToLoginPage();;
    }

    @Test
    public void loginPageLoadedTest() {
        Boolean isLoaded = loginPage.isLoginPageVisible();
        assertTrue(isLoaded);
    }

    @Test
    public void isNotRobotQuestion() {
        loginPage.signinClick();
        boolean isLoaded = loginPage.isNotRobotVisible();
        assertTrue(isLoaded);

    }

    @Test
    public void noCheckMarkRobotControlTest() {
        loginPage.signinClick();
        loginPage.emptySubmitNotRobotClick();
        boolean isLoaded = loginPage.isNotNotCorrectVisible();
        assertTrue(isLoaded);
    }


}
