package baseball.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BallTest {
    @Test
    public void initTest() {
        assertThatThrownBy(() -> Ball.of(11));
    }
}