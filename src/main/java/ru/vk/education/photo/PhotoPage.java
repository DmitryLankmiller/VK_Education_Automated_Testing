package ru.vk.education.photo;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import ru.vk.education.BasePage;

import java.io.File;
import java.util.Objects;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class PhotoPage extends BasePage {
    private final SelenideElement uploadPhotoButton =
            $(By.xpath(".//div[@id='hook_Block_PhotoVitrineBlock']//input[@type='file']"));
    private final SelenideElement uploadingProgress = $(By.xpath(".//*[@data-l='t,photo.uploader']//up-progress2"));
    private final SelenideElement uploadingResults = $(By.xpath(".//*[@data-l='t,photo.uploader']//up-uploading-results"));
    private final ElementsCollection photos = $$(By.xpath(".//*[@data-l='t,open-photo']"));


    private double getUploadingProgress() {
        return Double.parseDouble(Objects.requireNonNull(uploadingProgress.getAttribute("progress")));
    }

    public void uploadPhoto(File file) {
        uploadPhotoButton.uploadFile(file);
        while (getUploadingProgress() < 1);
        uploadingResults.shouldBe(visible);
        uploadingResults.shouldHave(attribute("completed-count", "1"));
        refresh();
    }

    public void openFirstPhoto() {
        photos.first().click();
    }

    public int getPhotosCount() {
        return photos.size();
    }

    @Override
    public void checkPage() {

    }
}
