//모든 사람들이 피자를 최소 1씩 먹기위한 피자판 갯수 (피자는 7조각)


package codingTest;

public class Pizza {

	public static void main(String[] args) {
		int n = 7;
		int answer = n%7==0?n/7:n/7+1;
        System.out.println(answer);
	}

}
