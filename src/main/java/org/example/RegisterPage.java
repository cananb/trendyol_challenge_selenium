package org.example;

import constants.TrendyolConstants;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegisterPage extends BasePage {
    public static String REGISTER = ".right > li:nth-of-type(2) > a";
    void goToPage() { open(TrendyolConstants.RegisterPage.URL);
    }
    public void gotoHelpSupportTab() {
        findByCss(REGISTER).click();
    }
    public void login() throws InterruptedException {
        $("#register-email").sendKeys("gns62653@zwoho.com");
        $("#register-password-input").setValue("123456789");
        $(".q-label").click();
        $(".q-primary").click();



        Thread.sleep(4000);

    }
}
