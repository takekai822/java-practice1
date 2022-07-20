package practice1;

public class Problem3_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = (int)(Math.random()*100)+1;
		System.out.println(number);
		if (number < 50) {
			System.out.println("50未満です");
		}
		if (number <= 10 || number >= 90) {
			System.out.println("10以下か90以上の値です");
		}
		if (number >= 20 && number < 80) {
			System.out.println("20以上80未満です");
		}
	}

}
