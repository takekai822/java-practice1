package practice1;

import java.util.Scanner;

public class Problem3_8_kitasoft {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int midTermExam = sc.nextInt();
		int finalExam = sc.nextInt();
		if (midTermExam >= 60 && finalExam >= 60) {
			System.out.println("合格");
		} else if ((midTermExam + finalExam) >= 130) {
			System.out.println("合格");
		} else if ((midTermExam + finalExam) >= 100 && (midTermExam >= 90 || finalExam >= 90)) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
	}

}
