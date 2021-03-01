package sec02;
import java.util.*;

import java.util.*;
public class Bjoo1018_2 {

	public static int min(int a, int b, int c) {
		if(a<b) {
			if(a<c)return a;
			else return c;
		}
		else {
			if(b<c)return b;
			else return c;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		char mat[][] = new char[n][m]; // 전체 체스판을 저장할 공간
		in.nextLine();
		for(int i = 0; i < n; i++) {
			mat[i] = in.nextLine().toCharArray() ;
		}
		int ans = (int)1e9; //1e9 == 1*10^9 : 도달할 수 없는 큰 값
		
		for(int a = 0; a <= n - 8; a++) {
			for(int b = 0; b <= m - 8; b++) {
				int num1 = 0, num2 = 0; 
				// num1 : 모든 W 홀수 & 모든 B 짝수  
				// num2 : 모든 W 짝수 & 모든 B 홀수 
				for(int i = a; i < a + 8; i++) {
					for(int j = b; j < b + 8; j++) {
						if(mat[i][j] == 'W') {
							if((i + j) % 2 == 0)num1++;// W를 홀수로 만들어야 하는데 짝수라니깐 반전시키는 비용추가
							else num2++; // W를 짝수로 만들어야 하는데 홀수라니깐 반전시키는 비용추가
						}
						else {
							if((i + j) % 2 == 0)num2++; // B을 홀수로 만들어야 하는데 짝수라니깐 반전시키는 비용추가
							else num1++; // B을 짝수로 만들어야 하는데 홀수라니깐 반전시키는 비용추가
						}
					}
				}
				ans = min(ans, num1, num2);
			}
		}
		System.out.println(ans);
		in.close();
	}

}
