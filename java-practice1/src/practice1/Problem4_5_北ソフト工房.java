package practice1;

import java.util.Scanner;

public class Problem4_5_北ソフト工房 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int number = sc.nextInt();
			sum += number;
		}
		System.out.println(sum / 10);
	}

}
