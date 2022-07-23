package practice1;

public class Problem4_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = (int)(Math.random()*10)+1;
		System.out.println("数：" + number);
		int i = 1;
		while (i <= number) {
			if (i == number) {
				System.out.println("■");
				break;
			} else {
				System.out.print("■ ");
				i++;
			}
		}
	}

}
