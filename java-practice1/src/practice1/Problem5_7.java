package practice1;

public class Problem5_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] data = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			data[i] = (int)(Math.random()*10)+1;
			if (i == 4) {
				System.out.println(data[i]);
			} else {
				System.out.print(data[i] + " ");
			}
			sum += data[i];
		}
		System.out.println("合計値：" + sum);
		System.out.println("平均値：" + sum / 5);
		System.out.print("平均値より大きい数：");
		for (int j = 0; j < 5; j++) {
			if (data[j] >= sum / 5) {
				System.out.print(data[j] + " ");
			}
		}
		System.out.println();
		System.out.print("平均値より小さい数：");
		for (int k = 0; k < 5; k++) {
			if (data[k] < sum / 5) {
				System.out.print(data[k] + " ");
			}
		}
	}

}
