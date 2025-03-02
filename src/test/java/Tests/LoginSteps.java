package Tests;

import Pages.DialogContent;
import Utilities.GWD;

import java.awt.*;
import java.awt.event.InputEvent;


public class LoginSteps extends DialogContent {

    public void registration_step() throws AWTException, InterruptedException {
        GWD.getDriver().get("https://app.forceget.com/system/account/register");
        Thread.sleep(5000);
        MySendKeys(firstName, "test");
        MySendKeys(lastName, "test1");
        MyClick(country);
        MyClick(albania);
        MySendKeys(phoneNumber, "5555922507");
        MySendKeys(company, "testCompany");
        MySendKeys(email, "serkansengul2@gmail.com");
        MyClick(title);
        MyClick(generalManager);
        MySendKeys(password, "Ab123456^");
        MySendKeys(confirmPassword, "Ab123456^");
        MyClickWithJS(checkBox);
        MyClick(termsButton);
        Robot robot = new Robot();
        robot.mouseMove(84, 835);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


    }

    public void login_step() {
        GWD.getDriver().get("https://app.forceget.com/system/account/register");
        MyClick(singUp);
        MySendKeys(email, "serkansengul2@gmail.com");
        MySendKeys(password, "Ab123456^");
        MyClick(singIn);
    }

}



