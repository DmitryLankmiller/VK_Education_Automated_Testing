package ru.vk.education;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage {


    public static class NavigationBar {
        private final SelenideElement profileButton = $(".navigation .__user-main");
        private final SelenideElement friendsButton = $(".navigation").find(new ByText("Друзья"));

        public SelenideElement profileButton() {
            return profileButton;
        }
        public void openFriends() {
            friendsButton.click();
        }
    }
}
