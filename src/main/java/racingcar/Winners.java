package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Winners {
    private List<Car> winners;
    private int maxPosition;

    public Winners(Cars cars) {
        this.winners = new ArrayList<>();
        this.maxPosition = calculateMaxPosition(cars);
        pickUpWinners(cars);
    }

    public List<Car> getWinners() {
        return this.winners;
    }

    private void pickUpWinners(Cars cars) {
        for (Car car : cars.getCars()) {
            pickUpWinner(car);
        }
    }

    private int calculateMaxPosition(Cars cars) {
        int max = 0;
        for (Car car : cars.getCars()) {
            max = Math.max(max, car.getPosition());
        }
        return max;
    }

    private void pickUpWinner(Car car) {
        if (isEqualToMaxPosition(car.getPosition()))
            this.winners.add(car);
    }

    public boolean isEqualToMaxPosition(int position) {
        return this.maxPosition == position;
    }
}
