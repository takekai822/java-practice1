package practice1;

public class Problem3_17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = (int)(Math.random()*100)+1;
		System.out.println(number);
		if (number < 50 && number % 2 == 0) {
			System.out.println("50以下の偶数です。");
		} else if (number < 50) {
			System.out.println("50以下です。");
		} else if (number % 2 == 0) {
			System.out.println("偶数です。");
		}
	}

}
