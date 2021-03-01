package sec01;
import java.io.*;
import java.util.*;
public class Bjoo1080 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());//행의 개수
		int M=Integer.parseInt(st.nextToken());//열의 개수
		int[][] h=new int [N][M];//첫번째 행렬
		int out[][]=new int [N][M];//두번째 행렬
		int res[][]=new int[N][M];//첫번째 행렬 원소와 두번째 행렬 원소의 관계를 체크하기위한 행렬
		int count=0;//횟수
		for(int i=0;i<N;i++) {
			String input=br.readLine();
			for(int j=0;j<M;j++) {
				h[i][j]=input.charAt(j)-'0';
			}
		}
		for(int i=0;i<N;i++) {
			String input=br.readLine();
			for(int j=0;j<M;j++) {
				out[i][j]=input.charAt(j)-'0';		
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(h[i][j]==out[i][j])
					res[i][j]=0; //같으면 0 대입
				else
					res[i][j]=1; //다르면 1 대입
			}
		}
		for(int i=0;i<N-2;i++) {
			for(int j=0;j<M-2;j++) {
				if(res[i][j]!=0) {
					change(res,i,j);
					count++;
				}
			}
		}
		if(check(res,N,M)==-1)
			count=-1;
		System.out.println(count);
	}

	public static void change(int a[][],int r, int c) {//3*3행렬 원소 뒤집기
		for(int i=r;i<r+3;i++)
			for(int j=c;j<c+3;j++) {
				a[i][j]=(a[i][j]==1) ? 0:1;
			}
	}
	public static int check(int a[][],int N,int M) {//두번째 행렬과 동일한지 확인하기
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(a[i][j]!=0)
					return -1;
				else
					continue;
			}
		}
		return 0;
	}

}
