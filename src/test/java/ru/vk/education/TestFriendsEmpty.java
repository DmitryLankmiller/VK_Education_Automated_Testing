package ru.vk.education;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;

public class TestFriendsEmpty extends TestWithLogin {
    private static final String EMPTY_FRIENDS = "Пока нет друзей";
    @Test
    public void shouldHaveNoFriends() {
        MainPage.NavigationBar navigationBar = new MainPage.NavigationBar();
        navigationBar.openFriends();
        FriendsPage friendsPage = new FriendsPage();
        friendsPage.getFriendCards().shouldHave(text(EMPTY_FRIENDS));
    }
}
