package baseball.view;

import baseball.domain.Command;
import baseball.domain.ThreeBalls;

import java.util.Scanner;

public class InputView {
    private static final Scanner input = new Scanner(System.in);

    public static ThreeBalls inputNumbers() {
        return TryUntilSuccess.run(() -> {
            System.out.println("숫자를 입력해주세요 : ");
            return new ThreeBalls(Integer.parseInt(input.nextLine().trim()));
        });
    }

    public static Command inputCommand() {
        return TryUntilSuccess.run(() -> {
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            return Command.ofCode(Integer.parseInt(input.nextLine().trim()));
        });
    }
}