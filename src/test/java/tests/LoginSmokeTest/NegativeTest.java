package tests.LoginSmokeTest;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPageLocators;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.*;
import static utilities.ReusableMethods.bekle;





public class NegativeTest {

    LoginPageLocators loginPageLocators =new LoginPageLocators();

    @BeforeMethod
    public void openSite() {

        Driver.getDriver().get("https://www.yemeksepeti.com/");


        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://www.yemeksepeti.com/");//Driver'ın anasayfada olduğu doğrulanır

        bekle(2);
    }
    @AfterMethod
    public void closeSite(){

        Driver.closeDriver();
    }
    @Test
    public void TC_02(){

        loginPageLocators.loginMainPage.click();
        bekle(1);

        loginPageLocators.loginButton.click();
        bekle(1);

        loginPageLocators.eMailButton.sendKeys(ConfigReader.getProperty("invalidmail"));
        bekle(1);

        loginPageLocators.devamEtButton.click();
        bekle(1);

        Assert.assertTrue(loginPageLocators.dogrulamaMesajı.getText().contains("Başlamak için e-posta adresinizi doğrulayalım"));
        //daha önceden kayıtlı olmayan bir mail adresi girildiğinde kayıt sayfasına yönlendiren mesajın görüntülendiği doğrulanır.
        ReusableMethods.tumSayfaResmi(); // Mesajın ekran görüntüsü alınır.

    }

    @Test
    public void TC_03(){
        loginPageLocators.loginMainPage.click();
        bekle(1);

        loginPageLocators.loginButton.click();
        bekle(1);

        loginPageLocators.eMailButton.sendKeys("yemeksepeti");
        bekle(1);

        loginPageLocators.devamEtButton.click();
        bekle(1);

        Assert.assertTrue(loginPageLocators.mailErrorMessage.isDisplayed()); //Geçersiz mail adresi girildiğinde error mesajının görüntülendiği doğrulanır
        bekle(1);
        ReusableMethods.tumSayfaResmi(); //Hata mesajının ekran görüntüsü alınır.


    }

    @Test
    public void TC_04(){
        loginPageLocators.loginMainPage.click();
        bekle(1);

        loginPageLocators.loginButton.click();
        bekle(1);

        loginPageLocators.eMailButton.sendKeys(ConfigReader.getProperty("useremail"));
        bekle(1);

        loginPageLocators.devamEtButton.click();
        bekle(1);

        loginPageLocators.password.sendKeys("yanlissifre");
        bekle(1);

        loginPageLocators.loginWthPass.click();
        bekle(2);

        Assert.assertTrue(loginPageLocators.passwrdErrorMessage.isDisplayed()); //Yanlış şifre girildiğinde error mesajının görüntülendiği doğrulanır
        ReusableMethods.tumSayfaResmi(); //Hata mesajının ekran görüntüsü alınır.



    }


}
