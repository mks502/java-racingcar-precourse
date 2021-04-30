package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.constant.MoveConditionRule;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static racingcar.constant.MoveConditionRule.*;

public class CarTest {
    @Test
    @DisplayName("자동차는 전진 할 수 있다.")
    void 자동차_전진() {
        String name = "woowa";
        Car car = new Car(name);
        int position = car.getPosition();
        car.moveFoward();
        assertThat(car.getPosition()).isEqualTo(position + 1);
    }

    @Test
    @DisplayName("자동차는 멈출 수 있다.")
    void 자동차_멈춤() {
        String name = "woowa";
        Car car = new Car(name);
        int position = car.getPosition();
        car.moveStop();
        assertThat(car.getPosition()).isEqualTo(position);
    }

    @ParameterizedTest
    @ValueSource(ints = {MOVE_FORWARD_CONDITION_NUMBER, MOVE_FORWARD_CONDITION_NUMBER+1})
    @DisplayName("랜덤한 값이 정해진 값 (4) 이상이라면 전진한다. -규칙 명시")
    void 자동차_4이상값_전진(int number){
        Car car = new Car("woowa");
        int expectPosition = car.getPosition()+1;
        car.controlMove(number);
        assertThat(car.getPosition()).isEqualTo(expectPosition);
    }

    @ParameterizedTest
    @ValueSource(ints = {MOVE_STOP_CONDITION_NUMBER, MOVE_STOP_CONDITION_NUMBER-1})
    @DisplayName("랜덤한 값이 정해진 값 (3) 이하라면 멈춘다. - 규칙 명시")
    void 자동차_3이하값_멈춤(int number){
        Car car = new Car("woowa");
        int expectPosition = car.getPosition();
        car.controlMove(number);
        assertThat(car.getPosition()).isEqualTo(expectPosition);
    }

    @ParameterizedTest
    @ValueSource(ints = {MIN_NUM-1, MAX_NUM+1})
    @DisplayName("랜덤한 값은 정해진 범위 (0~9)여야한다. - 규칙 명시")
    void 자동차_값에_벗어남_exception(int number){
        Car car = new Car("woowa");
        assertThatThrownBy(()->{
            car.controlMove(number);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
