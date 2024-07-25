package ru.vk.education.photo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;

import java.io.File;

public class TestPhotoPageWithPhotoOpenAndClose extends TestPhotoPage {
    private static final File PHOTO_FILE = new File("src/test/resources/cat.jpg");

    @BeforeEach
    @Timeout(value = 15L)
    public void uploadPhoto() {
        PhotoPage photoPage = new PhotoPage();
        photoPage.uploadPhoto(PHOTO_FILE);
        photoPage.openFirstPhoto();
    }

    @AfterEach
    public void deletePhoto() {
        OnePhotoPage photo = new OnePhotoPage();
        photo.deletePhoto();
        photo.closePhoto();
    }
}


