package ru.vk.education.photo;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.vk.education.BasePage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class OnePhotoPage extends BasePage {

    private final ElementsCollection commentsInput = $$(By.xpath(".//*[@class='comments_add_input']//*[@data-l='t,ta']"));
    private final ElementsCollection sendCommentButtons = $$(By.xpath(".//*[@class='comments_add_input']//*[@data-l='t,submit' and contains(@class, 'form')]"));
    private final ElementsCollection comments = $$(By.xpath(".//*[@data-l='t,text']"));
    private final SelenideElement photoExtraFunctions = $(By.xpath(".//*[@id='hook_Block_ActionsPLLB']/following-sibling::div/button"));
    private final SelenideElement deletePhotoButton = $(By.xpath(".//*[@id='hook_Block_ShortcutMenu']//li[last()]"));
    private final SelenideElement closePhotoButton = $(By.xpath(".//button[@tabindex='-1' and contains(@class, 'close')]"));

    public void sendComment(final String comment) {
        commentsInput.last().click();
        commentsInput.last().sendKeys(comment);
        sendCommentButtons.last().click();
    }

    public int getCommentsCount() {
        return comments.size();
    }

    public String getLastCommentText() {
        return comments.last().getText().trim();
    }

    public void deletePhoto() {
        photoExtraFunctions.click();
        deletePhotoButton.click();
    }

    public void closePhoto() {
        closePhotoButton.click();
        Selenide.refresh();
    }


    @Override
    public void checkPage() {

    }
}
