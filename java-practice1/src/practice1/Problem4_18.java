package practice1;

public class Problem4_18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == i && j == 9) {
					System.out.println("□");
				} else if (j == i){
					System.out.print("□ ");
				} else if (j == 9){
					System.out.println("■");
				} else {
					System.out.print("■ ");
				}
			}
		}
	}

}
