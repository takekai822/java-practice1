package practice1;

public class Problem3_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = (int)(Math.random()*21)-10;
		System.out.println(number);
		if (number < 0) {
			System.out.println("負の値です");
		} else if (number > 0) {
			System.out.println("正の値です");
		} else {
			System.out.println("0です");
		}
	}

}
