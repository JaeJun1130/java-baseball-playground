package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void SetUp(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("더하기 테스트")
    void add(){
        assertThat(4).isEqualTo(calculator.add(1,3));
    }

    @Test
    @DisplayName("문자열 계산하기")
    void strcal(){
        String str = "1 * 3 + 5 - 6 / 2";
        String[] seperate = calculator.seperate(str);
        int result = 1;
        assertThat(result).isEqualTo(calculator.calculation(seperate));
    }
}