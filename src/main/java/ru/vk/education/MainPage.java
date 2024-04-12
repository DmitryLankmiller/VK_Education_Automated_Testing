package ru.vk.education;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage {
    private final SelenideElement searchInput = $(By.xpath(".//*[@id='toolbar_search']/toolbar-search//input[@name='st.query']"));
    private final SelenideElement feed = $(By.id("hook_Block_MainFeedsWrapper"));
    private final SelenideElement alternativeContent = $(By.id("hook_Block_AlternativeContent"));

    public MainPage() {
        checkPage();
    }


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

    @Override
    public void checkPage() {
        feed.shouldBe(visible);
        alternativeContent.shouldBe(visible);
        searchInput.shouldBe(enabled);
        NavigationBar navigationBar = new NavigationBar();
        navigationBar.profileButton.shouldBe(enabled);
    }

    public static class NavigationBar {
        private final SelenideElement profileButton = $(By.xpath(".//div[@class='navigation']//a[contains(@data-l,'userPage')]"));
        private final SelenideElement friendsButton = $(By.xpath(".//div[@class='navigation']//a[contains(@data-l,'userFriend')]"));

        public SelenideElement profileButton() {
            return profileButton;
        }

        public void openFriends() {
            friendsButton.click();
        }
    }
}
