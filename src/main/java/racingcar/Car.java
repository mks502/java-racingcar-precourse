package racingcar;

import racingcar.util.RandomUtil;

import static racingcar.constant.MoveConditionRule.*;

public class Car {
    private CarName name;
    private int position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = 0;
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return name.getCarName();
    }

    public void moveFoward() {
        ++this.position;
    }

    public void controlMove(int number) {
        if (number < MIN_RANGE_NUM || number > MAX_RANGE_NUM) {
            throw new IllegalArgumentException("값의 범위를 벗어났습니다.");
        }
        if (number >= MOVE_FORWARD_CONDITION_NUMBER) {
            moveFoward();
            return;
        }
    }

    public void play() {
        int randomNumber = RandomUtil.createRandomNumber(MIN_RANGE_NUM, MAX_RANGE_NUM);
        controlMove(randomNumber);
    }
}
