package ru.vk.education;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFriendsEmpty extends TestWithLogin {
    private static final Pattern EMPTY_FRIENDS = Pattern.compile("Пока нет([  ])друзей");

    @Test
    public void shouldHaveNoFriends() {
        MainPage.NavigationBar navigationBar = new MainPage().navigationBar();
        navigationBar.openFriends();
        FriendsPage friendsPage = new FriendsPage();
        String friendsInfo = friendsPage.getFriendCards().getText();
        assertNotNull(friendsInfo, "Нет текста про отсутствие друзей");
        assertTrue(EMPTY_FRIENDS.matcher(friendsInfo).find(), "Текст отсутствия друзей не соответствует ожидаемому");
    }
}
