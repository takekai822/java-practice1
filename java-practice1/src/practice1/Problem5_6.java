package practice1;

public class Problem5_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] data = new int[10];
		int sum = 0;
		int max = 0;
		int min = 10;
		for (int i = 0; i < 10; i++) {
			data[i] = (int)(Math.random()*10)+1;
			System.out.print(data[i] + " ");
			sum += data[i];
			if (data[i] >= max) {
				max = data[i];
			} else if (data[i] <= min) {
				min = data[i];
			}
		}
		System.out.println();
		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
		System.out.println("平均値：" + sum / 10);
	}

}
