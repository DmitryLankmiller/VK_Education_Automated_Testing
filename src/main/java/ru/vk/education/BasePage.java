package ru.vk.education;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public abstract class BasePage {
    private static final SelenideElement acceptPrivacyButton = $(By.id("cmpbntyestxt"));

    public abstract void checkPage();

    public static boolean isAcceptPrivacyButtonDisplayed() {
        return acceptPrivacyButton.isDisplayed();
    }

    public static void clickAcceptPrivacyButton() {
        acceptPrivacyButton.click();
    }
}
