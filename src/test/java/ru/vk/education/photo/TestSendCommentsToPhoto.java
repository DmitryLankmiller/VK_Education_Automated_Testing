package ru.vk.education.photo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.vk.education.Utils.formatSpaces;

public class TestSendCommentsToPhoto extends TestPhotoPageWithPhotoOpenAndClose {

    public static Stream<Arguments> getCommentsPairs() {
        return Stream.of(
                Arguments.of("Привет!", "И тебе привет!"),
                Arguments.of("下午好！", "你好！ 今天天气好极了"),
                Arguments.of("   SKDJfkj#@k   jhf7nKJDSf    ", "skdufhuih!!!ksdhf8   awE aew aw e ")
        );
    }

    @ParameterizedTest
    @MethodSource("getCommentsPairs")
    @DisplayName("Should send 2 comments and check sent successfully")
    public void shouldSendComment(String text1, String text2) {
        OnePhotoPage photo = new OnePhotoPage();

        photo.sendComment(text1);
        assertEquals(formatSpaces(text1), photo.getLastCommentText());

        photo.sendComment(text2);
        assertEquals(formatSpaces(text2), photo.getLastCommentText());

        assertEquals(photo.getCommentsCount(), 2);
    }
}
