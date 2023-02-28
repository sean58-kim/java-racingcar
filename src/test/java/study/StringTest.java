package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StringTest {
    @Test
    void split1() {
        final String[] acutal = "1,2".split(",");
        // actual contains [1,2]
        System.out.println(Arrays.toString(acutal));
        assertThat(acutal).containsExactly("1","2");

    }

    @Test
    void split2() {
        final String[] acutal = "1".split(",");
        // actual contains [1,2]
        System.out.println(Arrays.toString(acutal));
        assertThat(acutal).containsExactly("1");

    }

    //"(1,2)" 값이 주어졌을 때 String의 ??? 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다.

    @Test
    void split3() {

//        String actual = "(1,2)".replace("(","")
//                               .replace(")","");
        String actual = "(1,2)".substring(1,4);
        System.out.println(actual);

        assertThat(actual).contains("1,2");

    }

    @Test
    void charAt(){
        final char actual = "abc".charAt(2);
        assertThat(actual).isEqualTo('c');

    }

    // "abc" 값이 주어졌을 때 String의 ??? 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.
    @DisplayName("특정위치의 문자를 가져올때 위차값을 벗어나면 예외가 발생한다.")
    @Test
    void charAt2(){
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> "abc".charAt(4));
    }


}
