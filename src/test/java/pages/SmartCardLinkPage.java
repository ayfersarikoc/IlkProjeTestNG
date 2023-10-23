package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;



    public class SmartCardLinkPage {

        public SmartCardLinkPage(){

            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(xpath = "//img[@alt='company-logo']" )
        public WebElement smartcardlinkLogosu;

        @FindBy(xpath = "//a[@class='nav-link active px-3 mt-1']" )
        public WebElement homeYaziElementi;

        @FindBy(xpath = "(//a[@class='nav-link mt-1'])[1]" )
        public WebElement featuresElementi;

        @FindBy(xpath = "(//a[@class='nav-link mt-1'])[2]" )
        public WebElement aboutElementi;

        @FindBy(xpath = "(//a[@class='nav-link mt-1'])[3]" )
        public WebElement pricingElementi;

        @FindBy(xpath = "//a[text()='Contact']" )
        public WebElement contactElementi;

        @FindBy(xpath = "(//a[@data-turbo='false'])[1]" )
        public WebElement signinButtonu;


        @FindBy(xpath = "//h2[text()='Subscribe here']" )
        public WebElement subscribeHereElementi;
    }


