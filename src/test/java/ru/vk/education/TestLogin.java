package ru.vk.education;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;

public class TestLogin extends BaseTest {

    @Test
    public void shouldLogIn() {
        LoginPage loginPage = new LoginPage();
        loginPage.setLogin(USER_LOGIN).setPassword(USER_PASSWORD).pressLoginButton();
        MainPage.NavigationBar navigationBar = new MainPage.NavigationBar();
        navigationBar.profileButton().shouldHave(text(USER_LOGIN));
    }
}
