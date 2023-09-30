import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.BooksResultPage;
import utils.UseCaseBase;
import static org.junit.jupiter.api.Assertions.*;


public class BookResultPageTest  extends UseCaseBase {

    private static BooksResultPage booksResultPage;

    @BeforeAll
    public static void classSetup() {

        booksResultPage = new BooksResultPage();
    }

    @BeforeEach
    public void beforeTest() {
        booksResultPage.navigateToBookResultPage();
    }

    @Test
    public void BookResultLoadedTest() {
        Boolean isLoaded = booksResultPage.isEnglishOnlyVisible();
        assertTrue(isLoaded);
    }

    @Test
    public void selectedBookTest() {
        booksResultPage.bookOfMyChoiceClick();
        boolean isLoaded = booksResultPage.isBookOfMyChoiceVisible();
        assertTrue(isLoaded);
    }

}
