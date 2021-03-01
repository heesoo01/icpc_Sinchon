package sec02;
import java.util.*;
//1~N���� �ڿ��� �� �ߺ����� M���� �� ����(��������)
public class Bjoo15649 {
	
	static int N, M, MAX=10;
	static int answer[]=new int[MAX];//���� ���� �迭
	static boolean isused[]=new boolean[MAX];//�ش� ���� �ߺ��� Ȯ���ϴ� �迭
		
	public static void solve(int level) {
		if(level==M) {
			for(int i=0;i<M;i++)
				System.out.print(answer[i]+" ");
			System.out.println();
			return;
		}
		for(int i=1;i<=N;i++) {
			if(isused[i])//���� �迭�� �� ������
				continue;
			isused[i]=true;
			answer[level]=i;
			solve(level+1);
			isused[i]=false;
		}
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		N=in.nextInt();
		M=in.nextInt();
		solve(0);
		in.close();	
	}
}
