// 김서방 찾기 


package codingTest;

public class Kim {

	public static void main(String[] args) {
		String[] seoul={"Kim","jan"};
		
		for (int i=0;i<seoul.length;i++) {
			if (seoul[i].equals("kim")) {
				String answer = "김서방은 "+i+"에 있다.";
			}
		}
		
		
	}

}
