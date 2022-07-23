package practice1;

public class Problem4_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = (int)(Math.random()*10)+1;
		System.out.println(number);
		if (number % 2 == 0) {
			for (int i = 0; i < number; i++) {
				System.out.print("★");
			}
		} else {
			for (int i = 0; i < number; i++) {
				System.out.print("☆");
			}
		}
	}

}
