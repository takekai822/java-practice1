package practice1;

public class Problem4_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int max = 0;
		int number;
		for (int i = 0; i < 5; i++) {
			number = (int)(Math.random()*100)+1;
			System.out.println(number);
			if (number > max) {
				max = number;
			}
		}
		System.out.println("最大値：" + max);
		
	}

}
