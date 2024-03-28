import org.junit.jupiter.api.BeforeAll;
import ru.vk.education.LoginPage;

public class TestWithLogin extends BaseTest {
    @BeforeAll
    public static void login() {
        new LoginPage().open().login(USER_LOGIN, USER_PASSWORD);
    }
}
