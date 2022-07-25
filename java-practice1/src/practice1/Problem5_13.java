package practice1;

public class Problem5_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] data = new int[3][3];
		int max = 0;
		int min = 9;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				data[i][j] = (int)(Math.random()*10);
				System.out.print(data[i][j] + " ");
				if (data[i][j] > max) {
					max = data[i][j];
				} else if (data[i][j] < min) {
					min = data[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
	}

}
