package practice1;

import java.util.Scanner;

public class Problem4_12_北ソフト工房 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (sum <= 100) {
			int number = sc.nextInt();
			sum += number;
		}
		System.out.println("合計値:" + sum);
	}

}
