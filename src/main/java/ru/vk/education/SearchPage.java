package ru.vk.education;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage extends BasePage {
    private final SelenideElement tabList = $(By.xpath(".//ul[@role='tablist']"));
    private final SelenideElement tabGroups = tabList.find(By.xpath(".//*[@id='tab-groups']"));
    private final SelenideElement search = $(By.xpath(".//div[@role='search']"));

    public SearchPage() {
        checkPage();
    }

    public boolean isTabGroupsPressed() {
        String condition = tabGroups.shouldBe(visible).getAttribute("aria-selected");
        return condition != null && condition.equals("true");
    }

    public void pressTabGroups() {
        tabGroups.shouldBe(enabled).click();
    }

    @Override
    public void checkPage() {
        tabList.shouldBe(visible);
        search.shouldBe(enabled);
        tabGroups.shouldBe(enabled);
    }

    public static class TabpanelGroups {
        private final SelenideElement tabPanelGroups = $(By.id("tabpanel-groups"));
        private final ElementsCollection groups = tabPanelGroups.findAll(By.xpath(".//*[contains(@class, 'row')]"));

        public ElementsCollection groups() {
            return groups;
        }
    }
}
