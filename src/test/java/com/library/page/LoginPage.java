package com.library.page;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement username;
    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;
    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement errorMsg;
}
