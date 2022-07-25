package practice1;

import java.util.Scanner;

public class Problem3_7_北ソフト工房 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x >= 60) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		int y = sc.nextInt();
		if (y >= 80) {
			System.out.println("たいへんよくできました。");
		} else if (y < 80 && y >= 60) {
			System.out.println("よくできました。");
		} else {
			System.out.println("ざんねんでした。");
		}
		int z = sc.nextInt();
		if (z >= 80) {
			System.out.println("優");
		} else if (z < 80 && z >= 70) {
			System.out.println("良");
		} else if (z < 70 && z >= 60) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
	}

}
