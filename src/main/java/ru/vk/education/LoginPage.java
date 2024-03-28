package ru.vk.education;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {
    private final SelenideElement loginField = $(By.id("field_email"));
    private final SelenideElement passwordField = $(By.id("field_password"));
    private final SelenideElement logInButton = $(By.cssSelector(".login-form-actions input"));

    public LoginPage open() {
        Selenide.open("/");
        return this;
    }
    public LoginPage setLogin(String login) {
        loginField.setValue(login);
        return this;
    }
    public LoginPage setPassword(String password) {
        passwordField.setValue(password);
        return this;
    }

    public void pressLoginButton() {
        this.logInButton.click();
    }

    public void login(String login, String password) {
        this.setLogin(login).setPassword(password).pressLoginButton();
    }
}

