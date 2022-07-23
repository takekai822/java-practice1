package practice1;

public class Problem4_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = (int)(Math.random()*10)+1;
		System.out.println("数：" + number);
		int i = 1;
		do {
			if (i == number) {
				System.out.print("■");
				break;
			} else {
				System.out.print("■ ");
				i++;
			}
		} while (i <= number);
	}

}
