package pages;

import consts.Consts;

public class CartPage extends BasePage {

    public static final String CART_PAGE_HEADER = "//*[@id = 'shopify-section-cart-template']";

    public static final String QTY_OF_BOOK_IN_CART = "//input[@class = 'cart__qty-input']";

    public static final String UPDATE_BUTTON = "//input[@class = 'btn btn--secondary cart__update cart__update--large small--hide']";
    public static final String LOGIN_ON_CARD_PAGE = "//*[@class='icon icon-login']";
    public static final String EMAIL_LOGIN = "//input[@id='CustomerEmail']";
    public static final String PASSWORD_LOGIN = "//input[@id='CustomerPassword']";
    public static final String SIGNIN_LOGIN = "//input[@type='submit'][@value='Sign In']";
    public static final String CART_ICON = "//svg[@class='icon icon-cart']";


    public static void navigateToCartPage() {

        webDriver.get(Consts.CART_PAGE);
    }


    public boolean isCartPageVisible(){

        return elementExists(CART_PAGE_HEADER);
    }

    public void loginButtonClick(){
        clickElementByXpath(LOGIN_ON_CARD_PAGE);
    }

    public void emailLogin() {
        sendTextToElementByXpath(EMAIL_LOGIN,"starovsky.dv@gmail.com");
    }

    public void passwordLogin() {
        sendTextToElementByXpath(PASSWORD_LOGIN,"@gmail.com");
    }
    public void signInButtonClick() {
        clickElementByXpath(SIGNIN_LOGIN);
    }

    public void myCartButtonClick() {
        clickElementByXpath(CART_ICON);
    }


    public void clearQtyBoxInCart() {
        clearUpElementByXpath(QTY_OF_BOOK_IN_CART);
    }

    public void numberOfBooksInCart() {
        sendTextToElementByXpath(QTY_OF_BOOK_IN_CART,"6");
    }

    public void addToCartClick() {
        clickElementByXpath(UPDATE_BUTTON);
    }

}
