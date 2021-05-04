package racingcar.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static racingcar.constant.MoveConditionRule.MAX_RANGE_NUM;
import static racingcar.constant.MoveConditionRule.MIN_RANGE_NUM;

class RandomUtilTest {
    public static final int ENOUGH_TEST_COUNT = 10000;

    @Test
    @DisplayName("랜덤한 값이 정해진 범위안으로 잘 생성되는지 테스트 한다.")
    void 랜덤값_생성_확인() {
        for(int i = 0; i< ENOUGH_TEST_COUNT; i++){
            int randomNumber = RandomUtil.createRandomNumber(MIN_RANGE_NUM, MAX_RANGE_NUM);
            assertThat(randomNumber).isBetween(MIN_RANGE_NUM, MAX_RANGE_NUM);
        }
    }
}
