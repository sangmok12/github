//수박수박수박수박수 만들기


package codingTest;

public class WaterMelon {

	public static void main(String[] args) {
		int n = 1;
		String answer = "";
		
		if (n % 2 == 0) {
			for (int i=0;i<n/2;i++) {
				answer += "수박";
			}
		} else {
			for (int i=0;i<n/2;i++) {
				answer += "수박";
			}
			answer += "수";
		}
		System.out.println(answer);

	}

}
