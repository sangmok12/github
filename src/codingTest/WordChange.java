package codingTest;

public class WordChange {

	public static void main(String[] args) {
		String s = "135one1two315five11eight";
		
		String [] n = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		for (int i=0;i<10;i++) {
			s = s.replace(n[i], String.valueOf(i));
		}
		int answer = Integer.parseInt(s);
		System.out.println(answer);
		
		
		
		
		
		
		
		
		
		
	}

}
