package ru.vk.education;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement searchInput =
            $(By.xpath(".//*[@id='toolbar_search']/toolbar-search//input[@name='st.query']"));

    public MainPage setValueToSearchBar(String value) {
        searchInput.setValue(value);
        return this;
    }

    public void pressSearchButton() {
        searchInput.pressEnter();
    }

    public void search(String value) {
        this.setValueToSearchBar(value).pressSearchButton();
    }

    public static class NavigationBar {
        private final SelenideElement profileButton =
                $(By.xpath(".//div[@class='navigation']//a[contains(@data-l,'userPage')]"));
        private final SelenideElement friendsButton =
                $(By.xpath(".//div[@class='navigation']//a[contains(@data-l,'userFriend')]"));

        public SelenideElement profileButton() {
            return profileButton;
        }

        public void openFriends() {
            friendsButton.click();
        }
    }
}
