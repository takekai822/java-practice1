package practice1;

import java.util.Scanner;

public class Problem3_4_kitasoft {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x > y) {
			System.out.println("xはyより大きい");
		} else if (x < y) {
			System.out.println("xはyより小さい");
		} else {
			System.out.println("xとyは等しい");
		}
	}

}
