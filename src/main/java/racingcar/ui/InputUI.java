package racingcar.ui;

import java.util.Scanner;

public class InputUI {
    private Scanner scanner = new Scanner(System.in);

    public String[] inputCarNames() {
        System.out.println(" 경주할자동차이름을입력하세요.(이름은쉼표(,)기준으로구분) ");
        return scanner.nextLine().split(",");
    }

    public int inputPlayCount() {
        System.out.println(" 시도할회수는몇회인가요? ");
        return scanner.nextInt();
    }
}
