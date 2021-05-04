package racingcar.ui;

import racingcar.Car;
import racingcar.Cars;
import racingcar.Winners;

public class OutputUI {
    public void printCarInfo(Car car) {
        StringBuilder stringBuilder = new StringBuilder("\t");
        stringBuilder.append(car.getName() + ":\t");
        for (int i = 0; i < car.getPosition(); i++) {
            stringBuilder.append("-");
        }
        stringBuilder.append("\n");
        System.out.print(stringBuilder.toString());
    }

    public void printCarsInfo(Cars cars) {
        for (Car car : cars.getCars()) {
            printCarInfo(car);
        }
        System.out.println();
    }

    public void printWinners(Winners winners) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Car winner : winners.getWinners()) {
            stringBuilder.append(winner.getName() + "\t");
        }
        stringBuilder.append("가 우승했습니다");
        System.out.println(stringBuilder.toString());
    }
}
