package baseball.domain;

import java.util.stream.Stream;

public enum Command {
    REPLAY(1),
    TERMINATE(2);

    private final int code;

    Command(int code) {
        this.code = code;
    }

    public static Command ofCode(int code) {
        return Stream.of(values()).filter(x -> x.code == code)
                                    .findAny()
                                    .get();
    }
}