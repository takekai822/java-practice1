package practice1;

public class Problem5_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] data = new int[5];
		for (int i = 0; i < 5; i++) {
			data[i] = (int)(Math.random()*100)+1;
			if (i == 4) {
				System.out.println(data[4]);
			} else {
				System.out.print(data[i] + " ");
			}
		}
		System.out.print("0以上60未満：");
		for (int j = 0; j < 5; j++) {
			if (data[j] < 60) {
				System.out.print(data[j] + " ");
			}
		}
		System.out.println();
		System.out.print("60以上80未満：");
		for (int k = 0; k < 5; k++) {
			if (data[k] >= 60 && data[k] < 80) {
				System.out.print(data[k] + " ");
			}
		}
		System.out.println();
		System.out.print("80以上：");
		for (int l = 0; l < 5; l++) {
			if (data[l] >= 80) {
				System.out.print(data[l] + " ");
			}
		}
	}

}
