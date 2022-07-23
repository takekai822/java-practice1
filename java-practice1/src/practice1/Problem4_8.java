package practice1;

public class Problem4_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = 0;
		while (number != 10) {
			number = (int)(Math.random()*10)+1;
			if (number == 10) {
				System.out.println(number);
				System.out.println("終了します");
				break;
			}
			System.out.println(number);
		}
	}

}
