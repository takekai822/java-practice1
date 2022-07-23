package practice1;

public class Problem4_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= 9; i++) {
			for (int n = 1; n <= 9; n++) {
				if (n == 9) {
					System.out.println(n + "*" + i + "=" + (n * i));
				} else {
					System.out.print(n + "*" + i + "=" + (n * i) + " ");
				}
			}
		}
	} 

}
