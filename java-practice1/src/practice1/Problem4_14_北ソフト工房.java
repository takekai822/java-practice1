package practice1;

import java.util.Scanner;

public class Problem4_14_北ソフト工房 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int count_s = 0;
		int count_b = 0;
		while (count_s < 3 && count_b < 4) {
			System.out.println("ストライク=1 or ボール=2 or ファウル=3？");
			int judge = sc.nextInt();
			if (judge == 1 || (judge == 3 && count_s < 2)) {
				count_s++;
			} else if (judge == 2) {
				count_b++;
			}
		}
		System.out.println(count_b + "ボール," + count_s + "ストライク");
	}

}
