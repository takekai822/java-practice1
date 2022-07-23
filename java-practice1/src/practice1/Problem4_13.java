package practice1;

public class Problem4_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = (int)(Math.random()*10)+1;
		if (number >= 5) {
			for (int i = 0; i < number; i++) {
				System.out.print("★");
			}
		} else {
			System.out.println("発生した数値：" + number);
		}
	}

}
