package com.library.utilities;

import com.library.page.LoginPage;
import org.checkerframework.checker.units.qual.C;

public class BrowserUtilities {
    static LoginPage loginPage = new LoginPage();

    public static void login(){
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("pass"));
        loginPage.loginBtn.click();
    }
}
