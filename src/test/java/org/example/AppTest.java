package org.example;

import static org.junit.Assert.assertTrue;

import constants.TrendyolConstants;
import org.junit.Test;


public class AppTest extends BasePage {

    @Test
    public void shouldAnswerWithTrue()
    {
     RegisterPage registerPage = new RegisterPage();
     HomePage homePage = new HomePage();


     registerPage.goToPage();
     homePage.goToPage();



        assertTrue( true );
    }
}
