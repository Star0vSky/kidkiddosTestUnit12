package pages;

import consts.Consts;

public class LoginPage extends BasePage{

    public static final String LOGIN_HEADER = "//h1[text()='Login']";


    protected static final String SIGN_IN = "//input[@value = 'Sign In']";

    public static final String NOT_A_ROBOT = "//p[@class = 'shopify-challenge__message']";

    public static final String SUBMIT = "//*[@value = 'Submit']";

    public static final String ANSWER_NOT_CORRECT = "//ul[@class = 'shopify-challenge__error']";



    public static void navigateToLoginPage(){

        webDriver.get(Consts.LOGIN_PAGE);
    }


    public boolean isLoginPageVisible(){

        return elementExists(LOGIN_HEADER);
    }


    public boolean isNotRobotVisible(){

        return elementExists(NOT_A_ROBOT);

    }


    public boolean isNotNotCorrectVisible(){

        return elementExists(ANSWER_NOT_CORRECT);

    }


    public void signinClick(){
    clickElementByXpath(SIGN_IN);

    }


    public void emptySubmitNotRobotClick(){
        clickElementByXpath(SUBMIT);

    }


}
