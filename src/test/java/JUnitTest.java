import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JUnitTest {
    @Test
    public void simpleTest() {
        final int correctAnswer = 4;
        int answer = 2+2;
        assertEquals(correctAnswer, answer);
    }
    @Test
    public  void theSimplestTest() {
        assertTrue(true);
    }
}
