import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import ru.vk.education.LoginPage;

public class TestWithLogin {
    private static final String USER_LOGIN = "technopol65";
    private static final String USER_PASSWORD = "technopolisPassword";
    @BeforeAll
    public static void startUp() {
        Configuration.baseUrl = "https://ok.ru/";
        Configuration.browser = "firefox";
        new LoginPage().open().login(USER_LOGIN, USER_PASSWORD);
    }
}
