package tests.LoginSmokeTest;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPageLocators;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import static utilities.ReusableMethods.*;

public class PositiveTest {

    LoginPageLocators loginPageLocators =new LoginPageLocators();

    @BeforeMethod
    public void openSite() {

        Driver.getDriver().get("https://www.yemeksepeti.com/");

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.yemeksepeti.com/"); //Driver'ın anasayfada olduğu doğrulanır
    }
    @AfterMethod
    public void closeSite(){

        Driver.closeDriver();
    }

    @Test
    public void TC_01(){

        loginPageLocators.loginMainPage.click();
        bekle(1);

        loginPageLocators.loginButton.click();
        bekle(1);

        loginPageLocators.eMailButton.sendKeys(ConfigReader.getProperty("useremail"));
        bekle(1);

        loginPageLocators.devamEtButton.click();
        bekle(1);

        loginPageLocators.password.sendKeys(ConfigReader.getProperty("userpassword"));
        bekle(1);

        loginPageLocators.loginWthPass.click();
        ReusableMethods.tumSayfaResmi(); //giriş yapıldıktan sonra ekran görüntüsü alınır.

    }




}
