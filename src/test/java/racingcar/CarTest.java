package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    void 자동차_전진() {
        String name = "woowa";
        Car car = new Car(name);
        int position = car.getPosition();
        car.moveFoward();
        assertThat(car.getPosition()).isEqualTo(position + 1);
    }

    @Test
    void 자동차_멈춤() {
        String name = "woowa";
        Car car = new Car(name);
        int position = car.getPosition();
        car.moveStop();
        assertThat(car.getPosition()).isEqualTo(position);
    }
}
