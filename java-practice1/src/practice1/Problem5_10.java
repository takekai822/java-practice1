package practice1;

public class Problem5_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] data = new int[7];
		for (int i = 0; i < 7; i++) {
			data[i] = (int)(Math.random()*10)+1;
			if (i == 6) {
				System.out.println(data[i]);
			} else {
				System.out.print(data[i] + " ");
			}
		}
		for (int j = 0; j < 7; j++) {
			for (int k = 1; k <= data[j]; k++) {
				if (k == data[j]) {
					System.out.println("*");
				} else {
					System.out.print("*");
				}
			}
		}
	}

}
