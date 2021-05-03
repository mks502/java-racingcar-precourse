package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class WinnersTest {

    public static final int PLAY_COUNT = 10;

    @Test
    @DisplayName("자동차 경주 후 제일 멀리까지 간 자동차들이 우승자들이다. 우승자들은 1명 이상이다.")
    void 제일_멀리까지_간_우승자들_선별() {
        Cars cars = new Cars(Arrays.asList("woo", "woowa", "tech"));
        for (int i = 0; i < PLAY_COUNT; i++) {
            cars.play();
        }
        Winners winners = new Winners(cars);
        assertThat(winners.getWinners()).hasSizeGreaterThanOrEqualTo(1);
        for (Car car : winners.getWinners()) {
            assertThat(winners.isEqualToMaxPosition(car.getPosition())).isTrue();
        }
    }
}
