// 3진법으로 만들고 뒤집어서 10진법으로 돌아오기




package codingTest;

import java.util.*;

public class Ternary {

	public static void main(String[] args) {
		int n = 125;
		int answer = 0;
		
		List<Integer> list = new ArrayList<Integer>(); 
		
		
		while(n>0) {
			list.add(n%3);
			n /= 3;
		}
		for(int i=0;i<list.size();i++) {
			answer += (list.get(i)*Math.pow(3,list.size()-1-i));
		}
		System.out.println(answer);
	
	}

}



//	1등 답
//	String a = "";
//	
//	while(n > 0){
//	    a = (n % 3) + a;
//	    n /= 3;
//	}
//	a = new StringBuilder(a).reverse().toString();
//	
//	
//	return Integer.parseInt(a,3);
