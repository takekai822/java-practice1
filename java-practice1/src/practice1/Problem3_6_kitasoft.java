package practice1;

import java.util.Scanner;

public class Problem3_6_kitasoft {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x % 2 == 0 && x >= 0) {
			System.out.println("正の偶数");
		} else if (x % 2 == 0 && x < 0) {
			System.out.println("負の偶数");
		} else if (x % 2 != 0 && x > 0) {
			System.out.println("正の奇数");
		} else {
			System.out.println("負の奇数");
		}
	}

}
