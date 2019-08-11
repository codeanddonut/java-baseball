package baseball.view;

import baseball.domain.Result;

public class OutputView {
    public static boolean printResult(Result result) {
        if (result.isNothing()) {
            System.out.println("낫싱");
            return true;
        }
        final StringBuilder output = new StringBuilder();
        if (result.strike() > 0) {
            output.append(result.strike());
            output.append("스트라이크 ");
        }
        output.append(result.ball());
        output.append("볼");
        System.out.println(output.toString());
        if (result.isThreeStrikes()) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return false;
        }
        return true;
    }
}