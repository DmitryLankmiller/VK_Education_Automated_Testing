package ru.vk.education;

import org.junit.jupiter.api.BeforeAll;

public class TestWithLogin extends BaseTest {
    @BeforeAll
    public static void login() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(USER_LOGIN, USER_PASSWORD);
    }
}
