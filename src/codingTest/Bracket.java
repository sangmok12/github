//  괄호 올바르게 닫기 ( 스택 )


package codingTest;

import java.util.Stack;

public class Bracket {

	public static void main(String[] args) {
		String s = ")()(";
		boolean answer = true;
		Stack<Character> stack = new Stack<>();
		
		for(char item : s.toCharArray()) {
			if(item == '(') {
				stack.push('(');
			}
			else {
				
				if(!stack.isEmpty()) {
					stack.pop();
				}
				else {
					answer = false;
				}
			}
		}
		answer = answer && stack.isEmpty();
		System.out.println(answer);
	}
}


//		1등 답안
//		boolean answer = false;
//		int count = 0;
//		for(int i = 0; i<s.length();i++){
//		    if(s.charAt(i) == '('){
//		        count++;
//		    }
//		    if(s.charAt(i) == ')'){
//		        count--;
//		    }
//		    if(count < 0){ // 괄호 닫음이 먼저 나오지 않게 
//		        break;
//		    }
//		}
//		if(count == 0){
//		    answer = true;
//		}