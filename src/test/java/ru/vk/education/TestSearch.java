package ru.vk.education;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSearch extends TestWithLogin {
    private static final String KEY_WORD = "котики";
    private static final int GROUPS_COUNT = 20;

    @Test
    public void shouldSearchGroups() {
        MainPage mainPage = new MainPage();
        mainPage.search(KEY_WORD);
        SearchPage searchPage = new SearchPage();
        assertTrue(searchPage.isTabGroupsPressed());
        SearchPage.TabpanelGroups tabpanelGroups = new SearchPage.TabpanelGroups();
        int groupsSize = tabpanelGroups.groups().size();
        assertEquals(GROUPS_COUNT, groupsSize, "Количество групп на странице не равно ожидаемому числу");
    }
}
