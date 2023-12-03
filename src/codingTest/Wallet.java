//명함을 돌려도 되니 최소직사각형을 구하라

package codingTest;


public class Wallet {

	public static void main(String[] args) {
		int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
		int temp = 0;
		int m1 = 0;
		int m2 = 0;
		
		for (int i=0;i<sizes.length;i++) {
			if(sizes[i][0] > sizes[i][1]) {
				temp = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = temp;
				
				System.out.println(sizes[i][0]+""+sizes[i][1]);
			}
			
			if( m1 < sizes[i][0]) m1 = sizes[i][0];
			if( m2 < sizes[i][1]) m2 = sizes[i][1];
		}
		int answer = m1*m2;
		
	}

}
