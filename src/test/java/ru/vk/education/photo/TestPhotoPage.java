package ru.vk.education.photo;

import org.junit.jupiter.api.BeforeAll;
import ru.vk.education.MainPage;
import ru.vk.education.TestWithLogin;

public class TestPhotoPage extends TestWithLogin {
    @BeforeAll
    public static void moveToPhotosPage() {
        MainPage.NavigationBar navigationBar = new MainPage().navigationBar();
        navigationBar.openPhoto();
    }
}
