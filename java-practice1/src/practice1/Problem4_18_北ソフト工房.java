package practice1;

import java.util.Scanner;

public class Problem4_18_北ソフト工房 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (sum >= 0) {
			int number = sc.nextInt();
			if (number == 0) {
				break;
			}
			sum += number;
		}
//		for( ; ; )
//		{
//		    int value = sc.nextInt();
//
//		    if( value == 0 )
//		        break;
//
//		    sum += value;
//		}
		System.out.printf("合計値:%d", sum);
	}

}
