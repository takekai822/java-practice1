package practice1;

import java.util.Scanner;

public class Problem4_6_北ソフト工房 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		for (int i = 0; i < 10; i++) {
			int judge = sc.nextInt();
			if (judge == 1) {
				win++;
			} else if (judge == 0) {
				lose++;
			}
		}
		System.out.println("勝ちの数:" + win);
		System.out.println("負けの数:" + lose);
	}

}
