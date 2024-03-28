package ru.vk.education;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage {


    public static class NavigationBar {
        private final SelenideElement profileButton = $(".navigation .__user-main");

        public SelenideElement profileButton() {
            return profileButton;
        }
    }
}
