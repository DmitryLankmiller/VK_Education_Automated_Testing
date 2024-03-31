package ru.vk.education;

import org.junit.jupiter.api.BeforeAll;

public class TestWithLogin extends BaseTest {
    @BeforeAll
    public static void login() {
        new LoginPage().open().login(USER_LOGIN, USER_PASSWORD);
    }
}
