package sec02;
import java.util.*;
//중복없이 1~N중 M개 수 고르기(오름차순)
public class Bjoo_15650 {
	static int answer[]=new int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		solve(0,1,N,M);
		sc.close();
	}
	
	public static void solve(int level, int num, int N, int M) {
		if(level==M) {
			for(int i=0;i<M;i++)
				System.out.print(answer[i]+" ");
			System.out.println();
			return;
			
		}
		for(int i=num;i<=N;i++) {
			answer[level]=i;
			solve(level+1,i+1,N,M);
		}
	}

}
