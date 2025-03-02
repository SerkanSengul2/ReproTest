package Tests;

import org.junit.Test;

import java.awt.*;

public class LoginStepTest extends LoginSteps {

    @Test()
    public void registration() throws InterruptedException, AWTException {
        registration_step();}

    @Test()
    public void login() {
        login_step();}
}
