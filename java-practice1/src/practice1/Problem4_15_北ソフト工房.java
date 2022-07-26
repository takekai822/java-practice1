package practice1;

import java.util.Scanner;

public class Problem4_15_北ソフト工房 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int i;
		for (i = 2; i <= number; i++) {
			if (number % i == 0) {
				break;
			}
		}
		if (i < number) {
			System.out.println("素数ではありません");
		} else {
			System.out.println("素数です");
		}
	}

}
