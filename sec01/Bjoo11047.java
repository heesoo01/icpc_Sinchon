package sec01;
import java.util.*;

public class Bjoo11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int A[]=new int[N];
		int p=0;
		int count=0;
		int rem=K;
		for(int i=0;i<N;i++)
			A[i]=sc.nextInt();
		for(int i=N-1;i>=0;i--) {
			if(A[i]<K) {
				p=i;
				break;
			}
		}
		for(int i=p;i>=0;i--) {
			if(rem==0)
				break;
			count+=rem/A[i];
			rem=rem-A[i]*(rem/A[i]);
		}
		System.out.println(count);
		
		
		
		

	}

}
