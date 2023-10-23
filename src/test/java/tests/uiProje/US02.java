package tests.uiProje;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SmartCardLinkPage;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.TestBaseRapor;


public class US02 extends TestBaseRapor {

    SmartCardLinkPage smartCardLinkPage;
    @Test
    public void headerIsDisplayTest(){

        //İlgili sayfaya gittiğimde Home page sayfasına girip header bölümünde ki menüde bulunan
        //SmartCardLink logosu, Home, Features, About, Pricing, Contact, SignIn butonunun aktif olduğunu
        //görüntüleyip doğrulayabilmeliyim.

        extentTest = extentReports.createTest("Başlık kısmının görünürlük testi","Başlık kısmını oluşturan elementlerin görüntülenebildiğini doğrulayabilmeliyim");
        Driver.getDriver().get(ConfigReader.getProperty("smartcardlinkUrl"));
        extentTest.info("Kullanici Smart Card Link anayfasina gider");

        smartCardLinkPage = new SmartCardLinkPage();

        Assert.assertTrue(smartCardLinkPage.smartcardlinkLogosu.isDisplayed());
        extentTest.pass("Smart Card Link logosunun görüntülendiğini test eder");

        Assert.assertTrue( smartCardLinkPage.homeYaziElementi.isDisplayed());
        extentTest.pass("Home yazisinin görüntülendiğini test eder");

        Assert.assertTrue(smartCardLinkPage.featuresElementi.isDisplayed());
        extentTest.pass("Feature yazisinin görüntülendiğini test eder");

        Assert.assertTrue( smartCardLinkPage.aboutElementi.isDisplayed());
        extentTest.pass("About yazisinin görüntülendiğini test eder");

        Assert.assertTrue(smartCardLinkPage.pricingElementi.isDisplayed());
        extentTest.pass("Pricing yazisinin görüntülendiğini test eder");

        Assert.assertTrue(smartCardLinkPage.contactElementi.isDisplayed());
        extentTest.pass("Contact yazisinin görüntülendiğini test eder");

        Assert.assertTrue(smartCardLinkPage.signinButtonu.isDisplayed());
        extentTest.pass("Signin butonunun görüntülendiğini test eder");

        Driver.closeDriver();
        extentTest.info("sayfayi kapatir");

    }

    @Test
    public void headerIsActiveTest(){
        //İlgili sayfaya gittiğimde Home page sayfasına girip header bölümünde ki menüde bulunan
        //SmartCardLink logosu, Home, Features, About, Pricing, Contact, SignIn butonunun aktif olduğunu
        //görüntüleyip doğrulayabilmeliyim.

        extentTest = extentReports.createTest("Aktiflik testi","Başlık kısmını oluşturan elementlerin aktif olduğunu doğrulayabilmeliyim");
        Driver.getDriver().get(ConfigReader.getProperty("smartcardlinkUrl"));
        extentTest.info("Kullanici Smart Card Link anayfasina gider");

        smartCardLinkPage = new SmartCardLinkPage();

        smartCardLinkPage.smartcardlinkLogosu.click();
        Assert.assertTrue(smartCardLinkPage.smartcardlinkLogosu.isDisplayed());
        extentTest.pass("SmartCardLink logosunun aktif olduğunu test eder");

        smartCardLinkPage.homeYaziElementi.click();
        String expectedUrl1 = "frontHomeTab";
        String actualUrl1 = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl1.contains(expectedUrl1));
        extentTest.pass("Home sayfasinin aktif olduğunu test eder");

        smartCardLinkPage.featuresElementi.click();
        String expectedUrl2 = "frontFeaturesTab";
        String actualUrl2 = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl2.contains(expectedUrl2));
        extentTest.pass("Feature sayfasinin aktif olduğunu test eder");

        smartCardLinkPage.aboutElementi.click();
        String expectedUrl3 = "frontAboutTabUsTab";
        String actualUrl3 = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl3.contains(expectedUrl3));
        extentTest.pass("About sayfasinin aktif olduğunu test eder");

        smartCardLinkPage.pricingElementi.click();
        String expectedUrl4 = "frontPricingTab";
        String actualUrl4 = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl4.contains(expectedUrl4));
        extentTest.pass("Pricing sayfasinin aktif olduğunu test eder");

        smartCardLinkPage.contactElementi.click();
        String expectedUrl5 = "frontContactUsTab";
        String actualUrl5 = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl5.contains(expectedUrl5));
        extentTest.pass("Contact sayfasinin aktif olduğunu test eder");

        smartCardLinkPage.signinButtonu.click();
        String expectedUrl6 = "login";
        String actualUrl6 = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl5.contains(expectedUrl5));
        extentTest.pass("Signin sayfasinin aktif olduğunu test eder");

        Driver.closeDriver();
        extentTest.info("sayfayi kapatir");

    }
}