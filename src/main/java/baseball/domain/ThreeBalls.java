package baseball.domain;

import baseball.utils.ThisList;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class ThreeBalls {
    private static final int MIN_INPUT = 123;
    private static final int MAX_INPUT = 987;

    private final List<Ball> balls;

    public ThreeBalls(int input) {
        if (input < MIN_INPUT || input > MAX_INPUT) {
            throw new IllegalArgumentException();
        }
        this.balls = Collections.unmodifiableList(
                Arrays.asList(
                        Ball.of(input / 100),
                        Ball.of(input / 10 % 10),
                        Ball.of(input % 10)
                )
        );
        if ((new HashSet<>(this.balls)).size() != 3) {
            throw new IllegalArgumentException();
        }
    }

    public ThreeBalls() {
        this.balls = Collections.unmodifiableList(
                ThisList.shuffle(Ball.allBalls()).subList(0, 3)
        );
    }

    public Result match(ThreeBalls rhs) {
        final int[] strike = {0};
        final int[] ball = {0};
        IntStream.range(0, 3).forEach(i -> {
            if (this.balls.get(i) == rhs.get(i)) {
                strike[0]++;
            } else if (this.balls.contains(rhs.get(i))) {
                ball[0]++;
            }
        });
        return Result.of(strike[0], ball[0]);
    }

    private Ball get(int i) {
        return this.balls.get(i);
    }
}