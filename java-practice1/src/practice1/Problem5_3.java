package practice1;

public class Problem5_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] data = new int[10];
		for (int i = 0; i < 10; i++) {
			data[i] = (int)(Math.random()*100)+1;
			if (i == 9) {
				System.out.println(data[i]);
			} else {
				System.out.print(data[i] + " ");
			}
		}
		System.out.print("奇数：");
		for (int j = 0; j < 10; j++) {
			if (j == 9 && data[j] % 2 != 0) {
				System.out.println(data[j]);
			} else if  (j == 9 && data[j] % 2 == 0) {
				System.out.println("");
			} else if (data[j] % 2 != 0) {
				System.out.print(data[j] + " ");
			}
		}
		System.out.print("偶数：");
		for (int k = 0; k < 10; k++) {
			if (data[k] % 2 == 0) {
				System.out.print(data[k] + " ");
			}
		}
	}

}
