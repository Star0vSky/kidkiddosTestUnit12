import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.ProductPage;
import utils.UseCaseBase;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ProductPageTest extends UseCaseBase {

    private static ProductPage productPage;

    @BeforeAll
    public static void classSetup() {

        productPage = new ProductPage();
    }

    @BeforeEach
    public void beforeTest() {
        productPage.navigateToProductPage();;
    }

    @Test
    public void productPageLoadedTest() {
        Boolean isLoaded = productPage.isProductPageVisible();
        assertTrue(isLoaded);
    }

    @Test
    public void selectFormatTest() {
        productPage.listOfFormatClick();
        productPage.hardCoverFormatClick();
        productPage.clearQtyBox();
        productPage.numberOfBooks();
        productPage.addToCartClick();
        boolean isLoaded = productPage.isCartPageOpened();
        assertTrue(isLoaded);
    }

    }


