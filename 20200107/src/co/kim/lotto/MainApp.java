package co.kim.lotto;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// 로또 자동 1게임당 1000원, 1페이지 최대 출력수 5행
		// 1행은 6개의 번호로 구성되고 순차적이고 중복수 존재하지않음
		// 1~45 랜덤으로 자동로또 1
		// 입력예시) 금액을 입력하세요? 7000

		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = 0;
		money = sc.nextInt();
		sc.nextLine();
		int c = money / 1000;
		for (int i = 0; i < c; i++) {
			if (i % 5 == 0) {
				System.out.println("===================");
			}
			Lotto();

		}

	}

	public static void Lotto() {

		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) { // 중복잡는 방법
				if (lotto[i] == lotto[j]) {
					i--;

				}

			}

		}
		for (int i = 0; i < lotto.length; i++) {
			Arrays.sort(lotto); // 오름차순으로 배열시키는 방법

			System.out.print(lotto[i] + " ");

		}
		System.out.println();

	}

}