package practice1;

import java.util.Scanner;

public class Problem3_9_kitasoft {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("曜日を選択");
		System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int week = sc.nextInt();
		System.out.println("時間を選択");
		System.out.println("0=午前、1=午後、2=夜間");
		int time = sc.nextInt();
		if (week == 0) {
			System.out.println("休診");
		} else if (time == 0 && (week == 2 || week == 5)) {
			System.out.println("休診");
		} else if (week == 3 && time == 2) {
			System.out.println("休診");
		} else if (week == 6 && time != 0) {
			System.out.println("休診");
		} else {
			System.out.println("開いています");
		}
	}

}
