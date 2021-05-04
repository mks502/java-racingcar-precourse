import racingcar.RacingCarGame;
import racingcar.ui.InputUI;
import racingcar.ui.OutputUI;

public class RacingCarApplication {
    public static void main(String[] args) {
        RacingCarGame racingCarGame = new RacingCarGame(new InputUI(), new OutputUI());
        racingCarGame.racingStart();
    }
}
