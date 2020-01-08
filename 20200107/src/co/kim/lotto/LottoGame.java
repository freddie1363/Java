package co.kim.lotto;

import java.util.Arrays;

public class LottoGame {
	private int money;

	public LottoGame(int money) {
		this.money = money;

	}

	private void createGame() {

		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) { // 중복잡는 방법
				if (lotto[i] == lotto[j]) {
					i--;
					break;

				}

			}

		}
		for (int i = 0; i < lotto.length; i++) {
			Arrays.sort(lotto, 0, lotto.length); // 오름차순으로 배열시키는 방법

			System.out.print(lotto[i] + "   ");

		}
	}

}
