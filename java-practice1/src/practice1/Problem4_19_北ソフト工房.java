package practice1;

import java.util.Scanner;

public class Problem4_19_北ソフト工房 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i;
		for (i = 0; i >= 0; i++) {
			int number = sc.nextInt();
			if (number == 0) {
				break;
			}
			sum += number;
		}
		System.out.println("平均値:" + sum / i);
	}

}
