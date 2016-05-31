package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login extends AbstractBasePage {

    public static final String URL_TODOIST = "https://en.todoist.com/";

    @FindBy(xpath = "//a[@href='/Users/showLogin']")
    private WebElement loginClass;

    @FindBy(id = "email")
    private WebElement emailTextField;

    @FindBy(id = "password")
    private WebElement passwordTextField;

    @FindBy(xpath = "//a[@tabindex='3']")
    private WebElement loginButton;


    public Login() {
        driver.get(URL_TODOIST);
    }

    public void setEmailTextField(String email) {
        driver.switchTo().frame("GB_frame").switchTo().frame("GB_frame");
        wait.until(ExpectedConditions.visibilityOf(emailTextField));
        emailTextField.clear();
        emailTextField.sendKeys(email);
    }

    public void setPasswordTextField(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordTextField));
        passwordTextField.clear();
        passwordTextField.sendKeys(password);
    }
    public void clickLoginClass() {
        wait.until(ExpectedConditions.elementToBeClickable(loginClass));
        loginClass.click();
    }
    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
        driver.switchTo().defaultContent();
    }

}
