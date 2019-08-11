package baseball.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ThreeBallsTest {
    @Test
    public void matchTestA() {
        assertThat((new ThreeBalls(738)).match(new ThreeBalls(783))).isEqualTo(Result.of(1, 2));
    }

    @Test
    public void matchTestB() {
        assertThat((new ThreeBalls(123)).match(new ThreeBalls(231))).isEqualTo(Result.of(0, 3));
    }

    @Test
    public void matchTestC() {
        assertThat((new ThreeBalls(893)).match(new ThreeBalls(125))).isEqualTo(Result.of(0, 0));
    }
}