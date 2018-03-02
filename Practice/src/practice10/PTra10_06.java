package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {


	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {
		final int DISTANCE = 300;
		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car car1 = new Car();
		car1.color = "red";
		car1.gasoline = 50;

		Car car2 = new Car();
		car2.color = "yellow";
		car2.gasoline = 45;

		Car car3 = new Car();
		car3.color = "blue";
		car3.gasoline = 55;

		int sum1 = 0;
		int count1 = 0;
		while(true) {
			int i = car1.run();
			count1++;
			if(i == -1) {
				System.out.println("目的地に到着できませんでした");
				break;
			}

			sum1 += i;
			System.out.println(sum1);

			if(sum1 > DISTANCE) {
				System.out.println("目的地まで"+count1+"時間かかりました。残りのガソリンは"+car1.gasoline+"リットルです。");
				break;
			}
		}
		int sum2 = 0;
		int count2 = 0;
		while(true) {
			int x = car2.run();
			count2++;
			if(x == -1) {
				System.out.println("目的地に到着できませんでした");
				break;
			}

			sum2 += x;
			System.out.println(sum2);

			if(sum2 > DISTANCE) {
				System.out.println("目的地まで"+count2+"時間かかりました。残りのガソリンは"+car2.gasoline+"リットルです。");
				break;
			}
		}
		int sum3 = 0;
		int count3 = 0;
		while(true) {
			int y = car3.run();
			count3++;
			if(y == -1) {
				System.out.println("目的地に到着できませんでした");
				break;
			}

			sum3 += y;
			System.out.println(sum3);

			if(sum3 > DISTANCE) {
				System.out.println("目的地まで"+count3+"時間かかりました。残りのガソリンは"+car3.gasoline+"リットルです。");
				break;
			}
		}
	}
}

