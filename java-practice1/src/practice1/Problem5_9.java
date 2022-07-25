package practice1;

public class Problem5_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] data = new int[10];
		for (int i = 0; i < 10; i++) {
			data[i] = (int)(Math.random()*100)+1;
			if (i == 9) {
				System.out.println(data[9]);
			} else {
				System.out.print(data[i] + " ");
			}
		}
		System.out.print("50以上の数：");
		for (int j = 0; j < 10; j++) {
			if (data[j] >= 50) {
				System.out.print(data[j] + " ");
			}
		}
		System.out.println();
		System.out.print("50未満の数：");
		for (int k = 0; k < 10; k++) {
			if (data[k] < 50) {
				System.out.print(data[k] + " ");
			}
		}
		System.out.println();
	}

}
