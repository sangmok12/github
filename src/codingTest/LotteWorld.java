//이 놀이기구의 원래 이용료 price원, 놀이기구를 N 번째 이용한다면 원래 이용료의 N배를 받기로. 
//즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상.
//놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 
//단, 금액이 부족하지 않으면 0을 return
		
		
package codingTest;

public class LotteWorld {

	public static void main(String[] args) {
		int price = 300;
		int money = 200000;
		int count = 4;
		long answer = 0;
		
		long sum = 0;
		for (int i=1;i<=count;i++) {
			sum += price*i;
			System.out.println("i: " + i + ", sum: " + sum);
		}
		answer = sum>money? sum-money:0;
		
		System.out.println(sum);
		System.out.println(answer);
	}

}
