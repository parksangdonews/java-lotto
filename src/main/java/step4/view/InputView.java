package step4.view;

import step4.domain.PurchaseInfo;
import step4.domain.lotto.Lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * InputView
 * ver. 1.0
 * 2020.05.31
 */
public class InputView {

    private static final String QUESTION_PAY_MONEY = "How much do you pay for Lotto Games ? : ";
    private static final String QUESTION_PAY_SELF_COUNT = "How many do you want self choosing number for Lotto Games ? : ";
    private static final String QUESTION_CHOOSE_NUMBER = "Input self Choosing Lotto Numbers ( Seperate number : , / Next Lotto : enter ) ";
    private static final String QUESTION_LAST_WEEK_WINNING_NUMBER = "Input Winning Number of last week. : ";
    private static final String QUESTION_LAST_WEEK_BONUS_BALL_NUMBER = "Input Bonus Number of last week. : ";

    private static final Scanner SCANNER = new Scanner(System.in);

    public static String inputPayMoney() {
        System.out.println(QUESTION_PAY_MONEY);
        String result = SCANNER.next();
        return result;
    }

    public static String inputCountForSelf() {
        System.out.println(QUESTION_PAY_SELF_COUNT);
        String result = SCANNER.next();
        return result;
    }

    public static List<Lotto> inputChooseNumbersForSelf(PurchaseInfo purchaseInfo) {
        System.out.println(QUESTION_CHOOSE_NUMBER);
        List<Lotto> lottos = new ArrayList<>();
        for (int i = 0; i < purchaseInfo.getSelfChooseCount(); i++) {
            String result = SCANNER.next();
            lottos.add(new Lotto(result));
        }
        return lottos;
    }

    public static String inputWiningNumber() {
        System.out.println(QUESTION_LAST_WEEK_WINNING_NUMBER);
        String result = SCANNER.next();
        return result;
    }

    public static String inputBonusNumber() {
        System.out.println(QUESTION_LAST_WEEK_BONUS_BALL_NUMBER);
        String result = SCANNER.next();
        return result;
    }

}
