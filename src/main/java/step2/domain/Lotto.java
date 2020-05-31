package step2.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Lotto
 * ver. 1.0
 * 2020.05.31
 * Copyright ...
 */
public class Lotto {

    private List<Integer> lottoNumbers = new ArrayList<>();

    private Lotto() {

    }

    public static Lotto of(int lottoMaxLimit, int lottoDrawLimit) {

        Lotto lotto = new Lotto();

        // ready
        List<Integer> lottoGameNumbers = new ArrayList<>();

        for (int i = 1; i < lottoMaxLimit; i++) {
            lottoGameNumbers.add(i);
        }

        // shuffle
        Collections.shuffle(lottoGameNumbers);

        // pick LOTTO_DRAW_LIMIT
        lotto.lottoNumbers = drawLottoNumbers(lottoGameNumbers, lottoDrawLimit);
        lotto.lottoNumbers.sort(Integer::compareTo);

        return lotto;

    }

    private static List<Integer> drawLottoNumbers(List<Integer> lottoGameNumbers, int lottoDrawLimitIndex) {
        return lottoGameNumbers.subList(0, lottoDrawLimitIndex);
    }


    public List<Integer> getNumbers() {
        return lottoNumbers;
    }


}
