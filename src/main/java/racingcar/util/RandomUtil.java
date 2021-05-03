package racingcar.util;

import java.util.Random;

public class RandomUtil {
    private static Random random = new Random();

    public static int createRandomNumber(int min, int max){
        return random.nextInt(max) + min;
    }
}
