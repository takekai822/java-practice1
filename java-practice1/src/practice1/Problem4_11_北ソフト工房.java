package practice1;

import java.util.Scanner;

public class Problem4_11_北ソフト工房 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < count; i++) {
			if (sum == 10) {
				sum = 0;
			} 
			System.out.print(sum);
			sum++;
		}
	}

}
