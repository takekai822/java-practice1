package practice1;

public class Problem4_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = (int)(Math.random()*10)+1;
		System.out.println("数:" + number);
		for (int i = 1; i <= number; i++) {
			if (i == number) {
				System.out.println("■");
			} else {
				System.out.print("■ ");
			}
		}
	}

}
