package practice1;

public class Problem5_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] data = new int[10];
		for (int i = 0; i < 10; i++) {
			data[i] = (int)(Math.random()*10)+1;
			if (i == 9) {
				System.out.println(data[9]);
			} else {
				System.out.print(data[i] + " ");
			}
		}
		System.out.print("3の倍数：");
		for (int j = 0; j < 10; j++) {
			if (data[j] % 3 == 0) {
				System.out.print(data[j] + " ");
			}
		}
		System.out.println();
		System.out.print("3の倍数以外の数：");
		for (int k = 0; k < 10; k++) {
			if (data[k] % 3 != 0) {
				System.out.print(data[k] + " ");
			}
				
		}
	}

}
