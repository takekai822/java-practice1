package practice1;

import java.util.Scanner;

public class Problem4_21_北ソフト工房 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				if (i == j || (number - i) == j - 1) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
