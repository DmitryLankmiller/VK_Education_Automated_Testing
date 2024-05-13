package ru.vk.education;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLogin extends BaseTest {
    private static final Pattern PROFILE_NAME_PATTERN = Pattern.compile(USER_LOGIN);

    @Test
    public void shouldLogIn() {
        LoginPage loginPage = new LoginPage();
        loginPage.setLogin(USER_LOGIN).setPassword(USER_PASSWORD).pressLoginButton();
        MainPage.NavigationBar navigationBar = new MainPage().navigationBar();
        String userInfo = navigationBar.profileButton().getText();
        assertTrue(PROFILE_NAME_PATTERN.matcher(userInfo).find(), "Имя в профиле не соответствует логину");
    }
}
