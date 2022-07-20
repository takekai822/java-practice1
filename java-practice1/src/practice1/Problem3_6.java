package practice1;

public class Problem3_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = (int)(Math.random()*6)+1;    //  1から6までの乱数を発生させる
        System.out.println("数値 : " + num);
        if (num >= 3) {
        	System.out.println("3以上です。");
        }
	}

}
