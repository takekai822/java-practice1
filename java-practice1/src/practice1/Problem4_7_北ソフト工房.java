package practice1;

import java.util.Scanner;

public class Problem4_7_北ソフト工房 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int score_k = 0;
		int score_h = 0;
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + "回表、巨人の得点は？");
			int point_k = sc.nextInt();
			score_k += point_k;
			System.out.print(i + "回裏、阪神の得点は？");
			int point_h = sc.nextInt();
			score_h += point_h;
		}
		System.out.println("巨人:" + score_k + ",阪神:" + score_h);
		if (score_k > score_h) {
			System.out.println("巨人の勝ち");
		} else if (score_k < score_h) {
			System.out.println("阪神の勝ち");
		} else {
			System.out.println("同点");
		}
	}

}
