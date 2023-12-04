//모든 사람들이 피자를 최소 1씩 먹기위한 피자판 갯수 (피자는 slice조각)


package codingTest;

public class Pizza2 {

	public static void main(String[] args) {
		int slice = 6;
		int n = 7;
		int answer = n%slice==0?n/slice:n/slice+1;
        System.out.println(answer);
	}

}
