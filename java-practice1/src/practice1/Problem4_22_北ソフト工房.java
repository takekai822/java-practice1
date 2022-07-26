package practice1;

public class Problem4_22_北ソフト工房 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int first = 0;
		int second = 1;
		int x = 0;
		System.out.print(first);
		for (int i = 0; second <= 1000; i++) {
			System.out.print("," + second);
			x = first;
			first = second;
			second = x + first;
		}
	}

}
