import java.util.List;

public class Main {
    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        boolean retry = true;

        while (retry) {
            String result = "";
            List<Integer> computer = baseballGame.create();
            while (!result.equals("3스트라이크")) {
                System.out.println("숫자를 입력해주세요");
                List<Integer> player = baseballGame.player();

                int total = baseballGame.total(computer, player);
                int strike = baseballGame.strike(computer, player);
                int ball = total - strike;

                if (total == 0) {
                    result = "낫싱";
                } else if (strike == 0) {
                    result = ball + "볼";
                } else if (ball == 0) {
                    result = strike + "스트라이크";
                } else {
                    result = ball + "볼 " + strike + "스트라이크";
                }

                System.out.println(result);
            }
            retry = baseballGame.retry();
        }
    }
}
