package practice1;

public class Problem3_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = (int)(Math.random()*100)+1;
		System.out.println(number);
		if (number % 6 == 0) {
			System.out.println("2と3の公倍数です。");
		} else if (number % 2 == 0) {
			System.out.println("2の倍数です。");
		} else if (number % 3 == 0) {
			System.out.println("3の倍数です。");
		}
	}

}
