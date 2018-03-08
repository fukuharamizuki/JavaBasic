/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、ava
		 * １行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<Player>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
            	Player player = new Player();


                String line = scanner.nextLine();
                // ★ 1行ごとにArrayListに格納してください
                String[] list = line.split(",",0);


                player.setPosition(list[0]);
                player.setName(list[1]);
                player.setCountry(list[2]);
                player.setTeam(list[3]);

                array.add(player);

            }

        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        Collections.shuffle(array);

        int gkcount = 0;
        int dfcount = 0;
        int mfcount = 0;
        int fwcount = 0;

        for(Player profile : array) {
        		if(profile.getPosition().equals("GK")) {
        			if(gkcount < 1) {
        				System.out.println(profile);
        			}
        			gkcount++;
        		}


        		if(profile.getPosition().equals("DF")) {
        			if(dfcount < 4) {
        				System.out.println(profile);
        			}
        			dfcount++;
        		}
        		if(profile.getPosition().equals("MF")) {
        			if(mfcount < 4) {
        				System.out.println(profile);
        			}
        			mfcount++;
        		}
        		if(profile.getPosition().equals("FW")) {
        			if(fwcount < 2) {
        				System.out.println(profile);
        			}
        			fwcount++;
        		}

        }


//       for(int i = 0; i < 1; i++) {
//       if(array.get(i).getPosition().equals("GK") ) {
//
//    	   		for(Player profile1 : array) {
//    	   			System.out.println(profile1);
//    	   		}
//       }
//       }
//       for(int a = array.size(); a < array.size()-4; a--) {
//    	   if(array.get(a).getPosition().equals("DF")) {
//    		   Collections.shuffle(array);
//    		   for(Player profile2 : array) {
//   	   			System.out.println(profile2);
//   	   		}
//    	   }
//       }
//       for(int x = array.size(); x < array.size()-4; x--) {
//    	   if(array.get(x).getPosition().equals("MF")) {
//    		   Collections.shuffle(array);
//    		   for(Player profile3 : array) {
//   	   			System.out.println(profile3);
//   	   		}
//    	   }
//       }
//       for(int y = array.size(); y < array.size()-2; y--) {
//    	   if(array.get(y).getPosition().equals("FW")) {
//    		   Collections.shuffle(array);
//    		   for(Player profile4 : array) {
//   	   			System.out.println(profile4);
//   	   		}
//    	   }
//       }

	}
}
