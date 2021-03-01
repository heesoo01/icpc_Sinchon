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
		
		char mat[][] = new char[n][m]; // ��ü ü������ ������ ����
		in.nextLine();
		for(int i = 0; i < n; i++) {
			mat[i] = in.nextLine().toCharArray() ;
		}
		int ans = (int)1e9; //1e9 == 1*10^9 : ������ �� ���� ū ��
		
		for(int a = 0; a <= n - 8; a++) {
			for(int b = 0; b <= m - 8; b++) {
				int num1 = 0, num2 = 0; 
				// num1 : ��� W Ȧ�� & ��� B ¦��  
				// num2 : ��� W ¦�� & ��� B Ȧ�� 
				for(int i = a; i < a + 8; i++) {
					for(int j = b; j < b + 8; j++) {
						if(mat[i][j] == 'W') {
							if((i + j) % 2 == 0)num1++;// W�� Ȧ���� ������ �ϴµ� ¦����ϱ� ������Ű�� ����߰�
							else num2++; // W�� ¦���� ������ �ϴµ� Ȧ����ϱ� ������Ű�� ����߰�
						}
						else {
							if((i + j) % 2 == 0)num2++; // B�� Ȧ���� ������ �ϴµ� ¦����ϱ� ������Ű�� ����߰�
							else num1++; // B�� ¦���� ������ �ϴµ� Ȧ����ϱ� ������Ű�� ����߰�
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
