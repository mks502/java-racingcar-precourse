package racingcar;

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

    public void moveFoward() {
        ++this.position;
    }

    public void moveStop() {
    }

    public void controlMove(int number) {
        if (number < MIN_NUM || number > MAX_NUM) {
            throw new IllegalArgumentException("값의 범위를 벗어났습니다.");
        }
        if (number >= MOVE_FORWARD_CONDITION_NUMBER) {
            moveFoward();
            return;
        }
        if (number <= MOVE_STOP_CONDITION_NUMBER) {
            moveStop();
            return;
        }
    }
}
