package practice1;

import java.util.Scanner;

public class Problem3_11_kitasoft {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("月を選択してください");
		int month = sc.nextInt();
		switch(month) {
			case 1:
				System.out.println("元日" );
		        System.out.println("成人の日");
		        break;
		    case 2:
		        System.out.println("建国記念の日");
		        break;
		    case 3:
		        System.out.println("春分の日");
		        break;
		    case 4:
		        System.out.println("昭和の日");
		        break;
		    case 5:
		        System.out.println("憲法記念日");
		        System.out.println("みどりの日");
		        System.out.println("こどもの日");
		        break;
		    case 6:
		    	break;
		    case 7:
		        System.out.println("海の日");
		        break;
		    case 8:
		    	break;
		    case 9:
		        System.out.println("敬老の日");
		        System.out.println("秋分の日");
		        break;
		    case 10:
		        System.out.println("体育の日");
		        break;
		    case 11:
		        System.out.println("文化の日" );
		        System.out.println("勤労感謝の日");
		        break;
		    case 12:
		        System.out.println("天皇誕生日");
		        break;
		}
	}

}
