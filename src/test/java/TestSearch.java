import org.junit.jupiter.api.Test;
import ru.vk.education.MainPage;
import ru.vk.education.SearchPage;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;

public class TestSearch {
    private static final String KEY_WORD = "котики";
    private static final int GROUPS_COUNT = 10;
    @Test
    public void shouldSearchGroups() {
        MainPage mainPage = new MainPage();
        mainPage.search(KEY_WORD);
        SearchPage searchPage = new SearchPage();
        searchPage.results().shouldHave(sizeGreaterThan(GROUPS_COUNT));
    }
}
