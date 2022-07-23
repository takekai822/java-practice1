package practice1;

public class Problem4_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i = 1;
		while (i % 10 != 0) {
			i = (int)(Math.random()*100)+1;
			if (i % 10 == 0) {
				System.out.println(i);
				System.out.println("終了します");
				break;
			}
			System.out.println(i);
		}
	}

}
