package practice1;

public class Problem5_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] data = new int[5];
		int low = 0;
		int high = 0;
		int equal0 = 0;
		for (int i = 0; i < 5; i++) {
			data[i] = (int)(Math.random()*21)-10;
			if (i == 4) {
				System.out.println(data[i]);
			} else {
				System.out.print(data[i] + " ");
			}
			if (data[i] < 0) {
				low++;
			} else if (data[i] > 0) {
				high++;
			} else {
				equal0++;
			}
		}
		System.out.println("0より大きい数：" + high + "個");
		System.out.println("0より小さい数：" + low + "個");
		System.out.println("0の個数：" + equal0 + "個");
	}

}
