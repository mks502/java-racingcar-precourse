package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNameTest {
    @ParameterizedTest
    @ValueSource(strings = {"w", "wo", "woo", "woow", "woowa"})
    @DisplayName("자동차 이름 규칙에 맞는 이름 생성")
    void 이름생성_규칙에_맞게_생성성공(String name) {
        CarName carName = new CarName(name);
        assertThat(carName.getCarName()).isEqualTo(name);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "woowahan", "woowahan-tech", "woowahan-tech-pro"})
    @DisplayName("자동차 이름 규칙에 벗어난 이름 생성")
    void 이름생성_규칙에_벗어나게_생성실패(String name) {
        assertThatThrownBy(() -> {
            new CarName(name);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
