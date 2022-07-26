package practice1;

import java.util.Scanner;

public class Problem4_16_北ソフト工房 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 2; number > 1; i++) {
			while (number % i == 0) {
				System.out.print(i + " ");
				number /= i;
			}
		}
	}

}
