//나머지 1


package codingTest;

public class rest1 {

	public static void main(String[] args) {
		int n = 20;
	
		int answer = 0;
        for (int i=2;i<n;i++) {
            if (n%i==1) {
                answer = i;
                break;
            }
        }
        System.out.println("뭐야");
	}
}
