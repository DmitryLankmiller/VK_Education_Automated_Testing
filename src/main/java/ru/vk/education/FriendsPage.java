package ru.vk.education;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FriendsPage {
    private final SelenideElement friendCards = $(By.id("hook_Block_MyFriendsSquareCardsPagingB"));

    public SelenideElement getFriendCards() {
        return friendCards;
    }
}
