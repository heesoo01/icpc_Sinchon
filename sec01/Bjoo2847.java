package sec01;

import java.util.Scanner;

public class Bjoo2847 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		int A[] = new int[n];
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		
		for(int i=n-1;i>=1;i--) {
			for(int j=i-1;j>=0;j--) {
				if(A[i]<=A[j]) {
					sum+=A[j]-A[i]+1;
					A[j]=A[i]-1;	
				}
			}
		}
	
		System.out.println("sum:"+sum);
		sc.close();
	}

}
