package sec01;
import java.io.*;
import java.util.*;
public class Bjoo1080 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());//���� ����
		int M=Integer.parseInt(st.nextToken());//���� ����
		int[][] h=new int [N][M];//ù��° ���
		int out[][]=new int [N][M];//�ι�° ���
		int res[][]=new int[N][M];//ù��° ��� ���ҿ� �ι�° ��� ������ ���踦 üũ�ϱ����� ���
		int count=0;//Ƚ��
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
					res[i][j]=0; //������ 0 ����
				else
					res[i][j]=1; //�ٸ��� 1 ����
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

	public static void change(int a[][],int r, int c) {//3*3��� ���� ������
		for(int i=r;i<r+3;i++)
			for(int j=c;j<c+3;j++) {
				a[i][j]=(a[i][j]==1) ? 0:1;
			}
	}
	public static int check(int a[][],int N,int M) {//�ι�° ��İ� �������� Ȯ���ϱ�
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
