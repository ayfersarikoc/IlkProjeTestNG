package tests.uiProje;
import org.testng.Assert;
import org.testng.annotations.Test;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.TestBaseRapor;


public class US01 extends TestBaseRapor {

    @Test
    public void titleTest(){

        // Açılan browser'a https://qa.smartcardlink.com adresini yazip
        //ansayfaya erişilebilmelidir ve siteye girildiğinde title’in “Smart Card Link” olduğu doğrulanmalıdır
        extentTest = extentReports.createTest("TestCase1: Basarili Title Test","Kullanici siteyi kullanabilmek icin web sitesine erişebildiğini doğrulayabilmelidir");

        Driver.getDriver().get(ConfigReader.getProperty("smartcardlinkUrl"));
        extentTest.info("Kullanici smart card link anasayfasina gider");

        String expectedTitle = "Smart Card Link";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
        extentTest.pass("Istenen sayfaya erisildigini test eder");

        Driver.closeDriver();
        extentTest.info("Sayfayı kapatır");

    }
}