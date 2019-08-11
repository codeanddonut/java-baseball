package baseball.domain;

import java.util.stream.IntStream;

public class Result {
    private static final Result[] CACHE = IntStream.range(0, 16)
                                                    .mapToObj(i -> new Result(i / 4, i % 4))
                                                    .toArray(Result[]::new);

    private final int strike;
    private final int ball;

    public static Result of(int strike, int ball) {
        return CACHE[strike * 4 + ball];
    }

    private Result(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public boolean isNothing() {
        return this.strike + this.ball == 0;
    }

    public boolean isThreeStrikes() {
        return this.strike == 3;
    }

    public int strike() {
        return this.strike;
    }

    public int ball() {
        return this.ball;
    }
}