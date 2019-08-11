package baseball.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Ball {
    public static final int MIN_NUM = 1;
    public static final int MAX_NUM = 9;
    public static final Ball[] CACHE = IntStream.rangeClosed(MIN_NUM, MAX_NUM)
                                                .mapToObj(Ball::new)
                                                .toArray(Ball[]::new);

    private final int number;

    public static Ball of(int number) {
        return CACHE[number - 1];
    }

    public static List<Ball> allBalls() {
        return new ArrayList<>(Arrays.asList(CACHE));
    }

    private Ball(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.valueOf(this.number);
    }
}