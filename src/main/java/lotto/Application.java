package lotto;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        Integer cost;
        System.out.println("구입 금액을 입력해 주세요.");
        cost = Integer.parseInt(Console.readLine());
        lotto.printLottoCount(cost);

    }
}
