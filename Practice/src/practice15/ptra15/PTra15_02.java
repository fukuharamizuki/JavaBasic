/*
 * PTra15_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import practice15.common.Java2Month;
import practice15.common.Room;

public class PTra15_02 {
	public static void main(String[] args) {

		Room room = new Java2Month();
		Java2Month jroom = (Java2Month)room;

		// roomに格納されたJava2MonthインスタンスのgetCurriculumメソッドを呼び出してください
		String[] getCurriculm = jroom.getCurriculum();

		// 取得したカリキュラム情報を全て出力してください
		for(String curriculum :  getCurriculm) {
			System.out.println(curriculum);
		}
	}
}
