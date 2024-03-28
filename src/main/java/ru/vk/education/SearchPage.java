package ru.vk.education;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    private final SelenideElement tabPanelGroups = $(By.id("tabpanel-groups"));
    private final ElementsCollection results = tabPanelGroups.find(By.tagName("div")).findAll(By.tagName("div"));

    public ElementsCollection results() {
        return results;
    }
}
