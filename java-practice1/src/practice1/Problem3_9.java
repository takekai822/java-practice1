package practice1;

public class Problem3_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = (int)(Math.random()*100)+1;
		System.out.println(number);
		if (number < 50) {
			System.out.println("50未満です");
		} else {
			System.out.println("50以上です");
		}
	}

}
