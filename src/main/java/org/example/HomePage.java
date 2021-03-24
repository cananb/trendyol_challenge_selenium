package org.example;

import constants.TrendyolConstants;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class HomePage extends  BasePage {

    public static String HOME = ".right > li:nth-of-type(2) > a";
    void goToPage() {
        open(TrendyolConstants.HomePage.URL1);
    }

    public void closePopup() {
        int handles = getWebDriver().getWindowHandles().size();
        switchTo().window(handles - 1);

        $(".fancybox-close").click();

    }
    public void Electronic() throws InterruptedException {
        int handles = getWebDriver().getWindowHandles().size();
        switchTo().window(handles - 1);

        $(".category-header").click();
        Thread.sleep(4000);



    }
    public void gotoHelpSupportTab() {
        findByCss(HOME).click();
    }
}
