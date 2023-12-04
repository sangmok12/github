package codingTest;

public class Oddnum {

	public static void main(String[] args) {
		int[] num_list= {1,3,5,1};
		int[] answer = new int[2];
		
		
		for(int i=0;i<num_list.length;i++) {
			if (num_list[i]%2==0) answer[0]++;
			else answer[1]++;
		}
		
	}

}
