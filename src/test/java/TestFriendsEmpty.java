import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.sun.tools.javac.Main;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.vk.education.FriendsPage;
import ru.vk.education.LoginPage;
import ru.vk.education.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;

public class TestFriendsEmpty extends TestWithLogin{
    @Test
    public void shouldHaveNoFriends() {
        MainPage.NavigationBar navigationBar = new MainPage.NavigationBar();
        navigationBar.openFriends();
        FriendsPage friendsPage = new FriendsPage();
        friendsPage.getFriendCards().shouldHave(text("Пока нет друзей"));
    }
}
