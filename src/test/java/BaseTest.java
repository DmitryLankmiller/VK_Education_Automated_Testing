import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    protected static final String USER_LOGIN = "technopol65";
    protected static final String USER_PASSWORD = "technopolisPassword";

    @BeforeAll
    public static void startUp() {
        Configuration.baseUrl = "https://ok.ru/";
        Configuration.browser = "firefox";
    }

    @AfterAll
    public static void shutDown() {
        Selenide.closeWebDriver();
    }
}
