//좌표를 봤을 때 점의 위치는 


package codingTest;

public class Quart {

	public static void main(String[] args) {
		int[] dot = {2,4};
		int answer = 0;
		
		if(dot[0] > 0 && dot[1] > 0) answer = 1;
		else if(dot[0] < 0 && dot[1] > 0) answer = 2;
		else if(dot[0] < 0 && dot[1] < 0) answer = 3;
		else if(dot[0] > 0 && dot[1] < 0) answer = 4;
		System.out.println(answer);
	}

}
