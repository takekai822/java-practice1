package practice1;

public class Problem3_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = (int)(Math.random()*3)+1;
		if (number == 1) {
			System.out.println(number);
			System.out.println("グー");
		} else if (number == 2) {
			System.out.println(number);
			System.out.println("パー");
		} else {
			System.out.println(number);
			System.out.println("チョキ");
		}
	}

}
