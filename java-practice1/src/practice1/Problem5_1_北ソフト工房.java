package practice1;

import java.util.Scanner;

public class Problem5_1_北ソフト工房 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10];
		for (int i = 0; i < 10; i++) {
			numbers[i] = sc.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(numbers[i] * 2 + " ");
		}
	}

}
