package sec02;
import java.util.*;
//1~N까지 자연수 중 중복없이 M개를 고른 수열(순서포함)
public class Bjoo15649 {
	
	static int N, M, MAX=10;
	static int answer[]=new int[MAX];//수를 넣을 배열
	static boolean isused[]=new boolean[MAX];//해당 수의 중복을 확인하는 배열
		
	public static void solve(int level) {
		if(level==M) {
			for(int i=0;i<M;i++)
				System.out.print(answer[i]+" ");
			System.out.println();
			return;
		}
		for(int i=1;i<=N;i++) {
			if(isused[i])//수가 배열에 들어가 있을때
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
