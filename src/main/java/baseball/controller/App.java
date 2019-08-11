package baseball.controller;

import baseball.domain.Command;
import baseball.domain.ThreeBalls;
import baseball.view.InputView;
import baseball.view.OutputView;

public class App {
    public static void main(String[] args) {
        while (gameLoop() == Command.REPLAY);
    }

    public static Command gameLoop() {
        final ThreeBalls answer = new ThreeBalls();
        while (OutputView.printResult(answer.match(InputView.inputNumbers())));
        return InputView.inputCommand();
    }
}