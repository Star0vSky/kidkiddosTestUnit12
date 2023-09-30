import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import utils.UseCaseBase;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartPageTest extends UseCaseBase {
    private static CartPage cartPage;

    @BeforeAll
    public static void classSetup() {

        cartPage = new CartPage();
    }

    @BeforeEach
    public void beforeTest() {
        cartPage.navigateToCartPage();

    }

    @Test
    public void cartPageLoadedTest() {
        Boolean isLoaded = cartPage.isCartPageVisible();
        assertTrue(isLoaded);
    }

    @Test
    public void loginToMyCartTest() {
        cartPage.loginButtonClick();
        cartPage.emailLogin();
        cartPage.passwordLogin();
        cartPage.signInButtonClick();
    //    cartPage.myCartButtonClick();
    }

//    @Test
//    public void newQtyAndUpdate() {
//        cartPage.clearQtyBoxInCart();
//        cartPage.numberOfBooksInCart();
//        cartPage.addToCartClick();
//}

}
