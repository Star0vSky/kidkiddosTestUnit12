package pages;

import consts.Consts;

public class HomePage extends BasePage{

    private static final String LOGO_IMG = "//img[@itemprop='logo']";
    private static final String LOGIN = "//*[@class='icon icon-login']";
    private static final String BOOKS_BY_LANGUAGE = "//a[@aria-controls='SiteNavLabel-books-by-language']";
    private static final String ENGLISH_ONLY = "//*[@id = 'SiteNavLabel-books-by-language']//descendant::*[@href = '/collections/english-only']";



    public void navigateToHomePage(){

        webDriver.get(Consts.MAIN_URL);
    }

    public boolean isLogoVisible(){

        Boolean isVisible = elementExists(LOGO_IMG);

        return isVisible;
    }


    public LoginPage openLoginIcon(){
        clickElementByXpath(LOGIN);
        return new LoginPage();
    }

    public BooksResultPage openBooksByLanguage(){
        clickElementByXpath(BOOKS_BY_LANGUAGE);
        clickElementByXpath(ENGLISH_ONLY);
        return new BooksResultPage();

    }

}
