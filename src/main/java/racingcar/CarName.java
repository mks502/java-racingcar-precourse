package racingcar;

import racingcar.constant.CarNameRule;

public class CarName {
    private String name;

    public CarName(String name) {
        isValidName(name);
        this.name = name;
    }

    public String getCarName() {
        return this.name;
    }

    private boolean isValidName(String name) {
        if (name.length() < CarNameRule.MIN_NAME_LENGTH || name.length() > CarNameRule.MAX_NAME_LENGTH)
            throw new IllegalArgumentException("자동차 이름 규칙에 맞지 않습니다.");
        return true;
    }
}
