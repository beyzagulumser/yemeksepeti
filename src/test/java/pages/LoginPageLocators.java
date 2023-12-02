package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageLocators {

    public LoginPageLocators(){
        PageFactory.initElements(Driver.getDriver(),this);}

@FindBy (xpath = "//*[@class='bds-c-btn bds-c-btn-secondary bds-c-btn--size-small bds-is-idle bds-c-btn--layout-default zi-surface-base']")
    public WebElement loginMainPage;


@FindBy (xpath = "//*[@class='button full']")
    public WebElement loginButton;


@FindBy (xpath = "//*[@id='email']")
    public WebElement eMailButton;

@FindBy (xpath = "//button[contains(@class, 'button status--default') and contains (text(), 'Devam Et')]")
//@FindBy (xpath = "//*[@type='submit']")
// @FindBy (xpath = "//*[@data-testid='email-view-continue-button']")
    public WebElement devamEtButton;

@FindBy (xpath = "//*[@id='password']")
    public WebElement password;

@FindBy(xpath = "//*[@data-testid='login-view-button-login']")
    public WebElement loginWthPass;

@FindBy(xpath = "//*[@data-testid='email-verify-button']")
    public WebElement verifyMail;

@FindBy (xpath = "//*[@class='f-title-large-font-size fw-title-large-font-weight lh-title-large-line-height ff-title-large-font-family mt-lg mb-sm']")
    public WebElement dogrulamaMesajı;

@FindBy (xpath = "//*[@class='input-message error']")
    public WebElement mailErrorMessage;

@FindBy (xpath = "//*[@class='input-message error']")
    public WebElement passwrdErrorMessage;




}
