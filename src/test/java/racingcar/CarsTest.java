package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class CarsTest {

    public static final int ENOUGH_TEST_COUNT = 15;
    private Cars cars;

    @BeforeEach
    @DisplayName("자동차들은 n대가 주어진다.")
    void 자동차들_생성() {
        String input = "woo,woowa,minsu";
        List<String> names = Arrays.asList(input.split(","));
        cars = new Cars(names);
    }

    @Test
    @DisplayName("자동차들은 1회씩 랜덤한 값에 따라 움직이거나 멈춘다.")
    void 자동차들_각_라운드_플레이() {
        for (int i = 0; i < ENOUGH_TEST_COUNT; i++) {
            cars.play();
        }
    }
}
