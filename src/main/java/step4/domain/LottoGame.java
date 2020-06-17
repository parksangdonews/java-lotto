package step4.domain;

import step4.domain.lotto.LottoNumber;
import step4.domain.lotto.LottoTickets;
import step4.domain.lotto.WinningLotto;
import step4.domain.prize.PrizeCount;
import step4.view.OutputView;

/*
 * LottoGame
 * ver. 1.0
 * 2020.05.31
 */
public class LottoGame {

    private static LottoTickets lottoTickets;

    public LottoGame(Integer boughtLottoCount) {
        lottoTickets = LottoNumber.issueLotto(boughtLottoCount);
        OutputView.outputLottoList(lottoTickets.getLottoTickets());
    }

   // matching
    public void matchingWinningNumbers(WinningLotto winningLotto) {
        winningLotto.matchingWinningNumbers(lottoTickets);
    }

    // winningResult
    public void totalResult() {
        PrizeCount prizeCount = PrizeCount.getInstance();
        prizeCount.outputWinningResult();
    }

}
