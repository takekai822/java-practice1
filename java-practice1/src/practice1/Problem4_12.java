package practice1;

public class Problem4_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int min = 100;
		int number;
		for (int i = 0; i < 5; i++) {
			number = (int)(Math.random()*100)+1;
			System.out.println(number);
			if (number < min) {
				min = number;
			}
		}
		System.out.println("最小値：" + min);
	}

}
