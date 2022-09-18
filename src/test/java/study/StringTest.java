package study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("1,2문자열 분리")
    void test1() {
        String actual = "1,2";
        String[] list = actual.split(",");
        assertThat(list).contains("1", "2");
    }

    @Test
    @DisplayName("()제거후 1,2문자열 분리")
    void test2() {
        String actual = "(1,2)";
        String substring = actual.substring(1, 4);
        assertThat(substring).isEqualTo("1,2");
    }

    @Test
    @DisplayName("특정문자열 가져오기")
    void test3() {
        String actual = "abc";
        char first = actual.charAt(0);
        char second = actual.charAt(1);
        char three = actual.charAt(2);
        assertThat(first).isEqualTo('a');
        assertThat(second).isEqualTo('b');
        assertThat(three).isEqualTo('c');
    }

    @Test
    @DisplayName("특정문자열 가져오다 StringIndexOutOfBoundsException 에러내기")
    void test4() {
        String actual = "abc";
        Assertions.assertThrows(StringIndexOutOfBoundsException.class, () -> actual.charAt(3));
        assertThatThrownBy(() -> actual.charAt(3)).isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}
