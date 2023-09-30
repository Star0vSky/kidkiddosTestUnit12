package pages;

import consts.Consts;

import static pages.ProductPage.SELECTED_BOOK;

public class BooksResultPage  extends BasePage {

    public static final String HEADER_ENGLISH_ONLY = "//*[@class = 'section-header text-center']//descendant::*[text() = 'English Only']";

    public static final String BOOK = "//*[@alt = 'I-Love-to-Keep-My-Room-Clean-Bedtime-Story-for-kids-English-language-Shelley-Admont-cover']";



    public static void navigateToBookResultPage(){

        webDriver.get(Consts.BOOK_RESULT_PAGE);
    }

    public boolean isEnglishOnlyVisible() {
        return elementExists(HEADER_ENGLISH_ONLY);

    }


    public boolean isBookOfMyChoiceVisible() {
        return elementExists(SELECTED_BOOK);

    }


    public void bookOfMyChoiceClick(){
        clickElementByXpath(BOOK);

    }

}
