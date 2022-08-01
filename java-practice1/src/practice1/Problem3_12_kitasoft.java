package practice1;

import java.util.Scanner;

public class Problem3_12_kitasoft {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("寿司を選択");
		System.out.println("1:マグロ,2:サーモン,3:いくら");
		int sushi = sc.nextInt();
		switch(sushi) {
			case 1:
				System.out.println("大吉");
				break;
			case 2:
				System.out.println("吉");
				break;
			case 3:
				System.out.println("凶");
				break;
		}
	}

}
