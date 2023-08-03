package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage  {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    //US_006
    //TC_001
    //course button
    @FindBy(xpath = "//a[text()='Course'][1]")
    public WebElement coursebutton;

    //course page
    @FindBy(xpath = "/a[@href='https://qa.wonderworldcollege.com/page/course'][1]")
    public WebElement coursepage;

    //TC_002
    //English and Literature
    @FindBy(xpath = "//h4[text()='English and Literature']")
    public WebElement englishandliterature;

    @FindBy(xpath = "(//a[text()='details'])[1]")
    public WebElement engdetails;
    //matematichs
    @FindBy(xpath = "//h4[text()='Mathematics']")
    public WebElement mathematics;
    @FindBy(xpath = "(//a[text()='details'])[2]")
    public WebElement matdetails;

    //sciences
    @FindBy(xpath = "//h4[text()='Sciences']")
    public WebElement sciences;
    @FindBy(xpath = "(//a[text()='details'])[3]")
    public WebElement sciencedetails;

    //social sciences
    @FindBy(xpath = "//h4[text()='Social Sciences']")
    public WebElement socialsciences;
    @FindBy(xpath = "(//a[text()='details'])[4]")
    public WebElement socdetails;

    //history
    @FindBy(xpath = "//h4[text()='History']")
    public WebElement history;
    @FindBy(xpath = "(//a[text()='details'])[5]")
    public WebElement histdetails;

    //arts and music
    @FindBy(xpath = "//h4[text()='Arts and Music']")
    public WebElement artsandmusic;
    @FindBy(xpath = "(//a[text()='details'])[6]")
    public WebElement artdetails;

    //Health and Exercise Sciences
    @FindBy(xpath = "//h4[text()='Health and Exercise Sciences']")
    public WebElement healthandexercisesciences;
    @FindBy(xpath = "(//a[text()='details'])[7]")
    public WebElement healthdetails;

    //Foreign Language
    @FindBy(xpath = "//h4[text()='Foreign Language']")
    public WebElement foreignlanguage;
    @FindBy(xpath = "(//a[text()='details'])[8]")
    public WebElement foreigndetails;

    //Computer Science
    @FindBy(xpath = "//h4[text()='Computer Science']")
    public WebElement computerscience;
    @FindBy(xpath = "(//a[text()='details'])[9]")
    public WebElement computerdetails;

    //quit course
    @FindBy(xpath = "(//li[@class=' '])[1]")
    public WebElement home;



    //US_008
    //TC_001
    @FindBy(xpath = "//div[@class='counter-content']")
    public WebElement acheivements;

    //TC_002
    @FindBy(xpath = "(//div[@class='counter-main'])[1]")
    public WebElement graduates;
    @FindBy(xpath = "(//div[@class='counter-main'])[2]")
    public WebElement certifiedteachers;
    @FindBy(xpath = "(//div[@class='counter-main'])[3]")
    public WebElement studentcampuses;
    @FindBy(xpath = "(//div[@class='counter-main'])[4]")
    public WebElement students;

    //US_009.feature
    //TC_001
    @FindBy(xpath = "(//a[text()='Contact'])[1]")
    public WebElement contactbutton;
    @FindBy(xpath = "(//a[@href='https://qa.wonderworldcollege.com/page/contact-us'])[1]")
    public WebElement contactpage;
    //TC_002
    @FindBy(xpath = "//input[@placeholder='Enter Your Name']")
    public WebElement enteryourname;
    @FindBy(xpath = "//input[@placeholder='Enter Your Email']")
    public WebElement enteryouremail;
    @FindBy(xpath = "//input[@placeholder='Enter Subject']")
    public WebElement entersubject;
    @FindBy(xpath = "//textarea[@placeholder='Enter Description']")
    public WebElement enterdescription;
    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submitbutton;
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement recordsavedsuccessfully;
    //TC_004
    @FindBy(xpath = "(//div[@class='contact-item'])[1]")
    public WebElement ourlocation;
    @FindBy(xpath = "(//div[@class='contact-item'])[2]")
    public WebElement collus;
    @FindBy(xpath = "(//div[@class='contact-item'])[3]")
    public WebElement workinghours;
















    @FindBy(xpath = " //a[@href='https://qa.wonderworldcollege.com/site/userlogin']")
    public WebElement HploginButton;



    //US_016
    //TC_03
    //login button
    @FindBy(xpath = "//a[@class='complainbtn']")
    public WebElement loginbutton;

    //username
    @FindBy(xpath = "//input[@type='text']")
    public WebElement username;

    //password
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    //signinbutton
    @FindBy(xpath = "//button[@class='btn']")
    public WebElement signinbutton;





}
