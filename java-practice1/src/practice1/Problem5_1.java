package practice1;

public class Problem5_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a [] = new int [7];
		for (int i = 0; i < 7; i++) {
			a [i] = (int)(Math.random()*10)+1;
			if (i == 6) {
				System.out.printf("a[%d]=%d", i, a[i]);
			} else {
				System.out.printf("a[%d]=%d ", i, a[i]);
			}
		}
	}

}
