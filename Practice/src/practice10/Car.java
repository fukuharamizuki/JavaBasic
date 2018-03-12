package practice10;

import java.util.Random;

public class Car {

	int serialNo	;
	String color;
	int gasoline	;

	int run() {
		this.gasoline--;

		if(this.gasoline < 0) {
			return -1;
		}

		int random = new Random().nextInt(15)+ 1;
		return random;



	}


}
