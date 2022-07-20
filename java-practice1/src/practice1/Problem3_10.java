package practice1;

public class Problem3_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = (int)(Math.random()*100)+1;
		System.out.println(number);
		if (number <= 10 || number >= 90) {
			System.out.println("10以下か90以上の値です");
		} else {
			System.out.println("10より大きく90未満です");
		}
	}

}
