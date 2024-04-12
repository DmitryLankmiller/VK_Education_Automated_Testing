package ru.vk.education;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    protected static final String USER_LOGIN = "technopol65";
    protected static final String USER_PASSWORD = "technopolisPassword";
    protected static final String BASE_URL = "https://ok.ru/";

    @BeforeAll
    public static void startUp() {
        Configuration.baseUrl = BASE_URL;
        Configuration.browser = "firefox";
        Selenide.open("/");
    }

    @AfterAll
    public static void shutDown() {
        Selenide.closeWebDriver();
    }
}
