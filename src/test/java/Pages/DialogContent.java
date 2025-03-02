package Pages;

import Utilities.GWD;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "firstName")
    public WebElement firstName;
    @FindBy(id = "lastName")
    public WebElement lastName;
    @FindBy(css = "[class='ant-form-item-control-input ng-tns-c2837444922-2']")
    public WebElement country;
    @FindBy(css = "[class='ipv_al ipv_flag']")
    public WebElement albania;
    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;
    @FindBy(id = "companyName")
    public WebElement company;
    @FindBy(css = "[formcontrolname='email']")
    public WebElement email;
    @FindBy(css = "[formcontrolname='jobTitle']")
    public WebElement title;
    @FindBy(css = "[title='Owner & General Manager']")
    public WebElement generalManager;
    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;
    @FindBy(css = "[formcontrolname='passwordConfirm']")
    public WebElement confirmPassword;
    @FindBy(css = "[formcontrolname='privacyPolicy']")
    public WebElement checkBox;
    @FindBy(css = "[class='ant-btn ant-btn-primary']")
    public WebElement termsButton;
    @FindBy(css = "[href='/account/login']")
    public WebElement singUp;
    @FindBy(css = "[class='ant-btn ant-btn-primary']")
    public WebElement singIn;
}
