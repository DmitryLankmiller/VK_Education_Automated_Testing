import org.junit.jupiter.api.Test;
import ru.vk.education.FriendsPage;
import ru.vk.education.MainPage;

import static com.codeborne.selenide.Condition.text;

public class TestFriendsEmpty extends TestWithLogin{
    @Test
    public void shouldHaveNoFriends() {
        MainPage.NavigationBar navigationBar = new MainPage.NavigationBar();
        navigationBar.openFriends();
        FriendsPage friendsPage = new FriendsPage();
        friendsPage.getFriendCards().shouldHave(text("Пока нет друзей"));
    }
}
