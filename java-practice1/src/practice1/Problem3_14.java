package practice1;

public class Problem3_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = (int)(Math.random()*10)+1;
		int b = (int)(Math.random()*10)+1;
		if (a > b) {
			System.out.println("aの方が大きいです");
		} else if (b > a) {
			System.out.println("bの方が大きいです");
		} else {
			System.out.println("等しいです");
		}
	}

}
