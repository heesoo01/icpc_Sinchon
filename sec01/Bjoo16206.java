package sec01;

import java.util.Scanner;

public class Bjoo16206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();//����ũ����
		int m=sc.nextInt();//�ִ� �ڸ��� �ִ� Ƚ��M
		int A[]= new int[n];
		int B[]= new int[n];//����ũ���� ���� �迭
		int a=0,b=0;
		for(int i=0;i<n;i++) {
			int v=sc.nextInt();
			if(v%10==0)
				A[a++]=v;
			else
				B[b++]=v;
		}
		
		int j;
		for(int i=1;i<a;i++) {
			int key=A[i];
			for(j=i-1;j>=0&&A[j]>key;j--)
				A[j+1]=A[j];
			A[j+1]=key;
		}
		for(int i=1;i<b;i++) { //�迭���� �������� ��������
			int key=B[i];
			for(j=i-1;j>=0&&B[j]>key;j--)
				B[j+1]=B[j];
			B[j+1]=key;
		}
		for(int i=a;i<a+b;i++) {
			A[i]=B[i-a];
		}

		int sum=0;
	      for(int i=0;i<n;i++) {
	         if(m<=0)//���̻� �ڸ�Ƚ���� �ȳ����� break
	            break;
	         if(A[i]%10==0&&A[i]/10-1<=m) {//����ũ���̰� 10�� ����̰� �ִ��� �� �ڸ� �� �ִٸ�
	            sum+=A[i]/10;
	            m-=(A[i]/10-1);
	         }
	         else if(A[i]/10<=m){//����ũ���̰� 10����� �ƴϰ� �ִ��� �� �ڸ� �� �ִٸ�
	            sum+=A[i]/10;
	            m-=A[i]/10;
	         }
	         else {//����ũ�� �ִ��� �� �ڸ� �� ���ٸ�
	            sum+=m;
	            m-=m;
	         }
	      }
		
		System.out.println(sum);	
		sc.close();
	}

}
