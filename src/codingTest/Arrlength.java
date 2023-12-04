package codingTest;

public class Arrlength {

	public static void main(String[] args) {
		String[] strlist = {"sie","aivns"};
		
		int[] answer = new int[strlist.length];
		
		for (int i=0;i<strlist.length;i++) {
			answer[i] = strlist[i].length();
		}
	}

}
