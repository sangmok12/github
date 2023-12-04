//a기준   c[0]부터 c[1]까지의 수 중 c[2]번째 수를 새로운배열에 넣기 



package codingTest;

import java.util.Arrays;

public class KrdInt {

	public static void main(String[] args) {
		int[] a = {1,5,2,6,3,7,4};
		int[][]c= {{2,5,3},{4,4,1},{1,7,3}};
		int l = c.length;
		int[] answer = new int [l];
		
		for (int i=0;i<l;i++) {
			int l2 = c[i][1]-c[i][0]+1;
			int []t = new int [l2];
			int index=0;
			for (int j = c[i][0]-1;j<c[i][1];j++) {
				t[index++] = a[j];
			}
			Arrays.sort(t);
			answer[i]=t[c[i][2]-1];
			
		}
		System.out.println(Arrays.toString(answer));
		
		
		
		
	}

}
