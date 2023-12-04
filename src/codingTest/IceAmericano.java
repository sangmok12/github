package codingTest;

import java.util.Arrays;

public class IceAmericano {

	public static void main(String[] args) {
		int money = 30000;
		int[] answer = {money/5500,money%5500};
		System.out.println(Arrays.toString(answer));
	}

}
