package step4.domain.lotto;

import step4.view.OutputView;

import java.util.List;

/*
 * Lotto
 * Lotto Tickets
 * ver. 1.0
 * 2020.06.06.
 */
public class LottoTickets {

    private final List<Lotto> lottoTickets;

    public LottoTickets(List<Lotto> lottoTickets) {
        this.lottoTickets = lottoTickets;
    }

    public List<Lotto> getLottoTickets() {
        return lottoTickets;
    }

    public void showIssuedLottoTickets() {
        OutputView.outputLottoList(lottoTickets);
    }

}
