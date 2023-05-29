//하샤드 수 = 각 자릿수를 더한값으로 나눴을 때 0이 되는 수 




package codingTest;

public class HarshadNum {

	public static void main(String[] args) {
		int x = 10;
		boolean answer = true;
		String xlen= Integer.toString(x);
		int a = 0;
		int b = x;
		
		while (b>0) {
			a += b%10;
			b=b/10;
		}
		
		answer = x%a==0;
		System.out.println(answer);
		
		

	}

}
