package sec01;

import java.util.Scanner;

public class Bjoo16206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();//케이크개수
		int m=sc.nextInt();//최대 자를수 있는 횟수M
		int A[]= new int[n];
		int B[]= new int[n];//케이크값을 넣을 배열
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
		for(int i=1;i<b;i++) { //배열원소 오름차순 삽입정렬
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
	         if(m<=0)//더이상 자를횟수가 안남으면 break
	            break;
	         if(A[i]%10==0&&A[i]/10-1<=m) {//케이크길이가 10의 배수이고 최대한 다 자를 수 있다면
	            sum+=A[i]/10;
	            m-=(A[i]/10-1);
	         }
	         else if(A[i]/10<=m){//케이크길이가 10배수가 아니고 최대한 다 자를 수 있다면
	            sum+=A[i]/10;
	            m-=A[i]/10;
	         }
	         else {//케이크를 최대한 다 자를 수 없다면
	            sum+=m;
	            m-=m;
	         }
	      }
		
		System.out.println(sum);	
		sc.close();
	}

}
