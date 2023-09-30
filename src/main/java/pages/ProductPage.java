package pages;

import consts.Consts;

import static pages.CartPage.CART_PAGE_HEADER;

public class ProductPage extends BasePage {

    public static final String SELECTED_BOOK = "//*[@src = '//kidkiddos.com/cdn/shop/products/I-Love-to-Keep-My-Room-Clean-Bedtime-Story-for-kids-English-language-cover_530x@2x.jpg?v=1492987758']";
    public static final String FORMAT_LIST = "//*[@class = 'selector-wrapper js product-form__item']//descendant::*[@class='single-option-selector single-option-selector-product-template product-form__input']";
    public static final String HARD_COVER_FORMAT = "//*[@class = 'selector-wrapper js product-form__item']//descendant::*[@class = 'single-option-selector single-option-selector-product-template product-form__input']//descendant::*[@value='Hardcover']";

    public static final String QTY_OF_BOOK_BOX = "//*[@class='product-form__item product-form__item--quantity']//descendant::*[@class='product-form__input']";

    public static final String ADD_TO_CART = "//*[@id = 'AddToCartText-product-template']";


    public static void navigateToProductPage() {

        webDriver.get(Consts.PRODUCT_PAGE);
    }


    public boolean isProductPageVisible(){

        return elementExists(SELECTED_BOOK);
    }


    public boolean isCartPageOpened(){

        return elementExists(CART_PAGE_HEADER);
    }

    public void listOfFormatClick() {
        clickElementByXpath(FORMAT_LIST);
    }


    public void hardCoverFormatClick() {
        clickElementByXpath(HARD_COVER_FORMAT);
    }


    public void addToCartClick() {
        clickElementByXpath(ADD_TO_CART);
    }



    public void clearQtyBox() {
        clearUpElementByXpath(QTY_OF_BOOK_BOX);
    }

    public void numberOfBooks() {
        sendTextToElementByXpath(QTY_OF_BOOK_BOX,"5");
    }

}
