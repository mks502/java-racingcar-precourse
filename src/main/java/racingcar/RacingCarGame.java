package racingcar;

import racingcar.ui.InputUI;
import racingcar.ui.OutputUI;

import java.util.Arrays;

public class RacingCarGame {
    private final InputUI inputUI;
    private final OutputUI outputUI;

    public RacingCarGame(InputUI inputUI, OutputUI outputUI) {
        this.inputUI = inputUI;
        this.outputUI = outputUI;
    }

    public void racingStart() {
        Cars cars = inputCars();
        int playCount = inputPlayCount();

        //playCount 만큼 자동차들 경주
        playing(cars, playCount);

        //사용자 입력을 통해 n대의 자동차들이 playCount 만큼 자동차 경주를 한 후 우승자들 선별
        finish(cars);
    }

    private Cars inputCars() {
        return new Cars(Arrays.asList(inputUI.inputCarNames()));
    }

    private int inputPlayCount() {
        return inputUI.inputPlayCount();
    }

    private void playing(Cars cars, int playCount) {
        for (int i = 0; i < playCount; i++) {
            cars.play();
            outputUI.printCarsInfo(cars);
        }
    }

    private void finish(Cars cars) {
        Winners winners = new Winners(cars);
        outputUI.printWinners(winners);
    }
}
