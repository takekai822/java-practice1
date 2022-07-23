package practice1;

public class Problem4_17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 9) {
					System.out.println("■");
				} else {
					System.out.print("■ ");
				}
			}
			for (int k = i + 1; k <= 9; k++) {
				if (k == 9) {
					System.out.println("□");
				} else {
					System.out.print("□ ");
				}
			}
		}
	}

}
