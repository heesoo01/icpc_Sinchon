package sec01;
import java.util.*;

public class Bjoo11399 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int P[]=new int[N];
		for(int i=0;i<N;i++) {
			P[i]=sc.nextInt();
		}
		Arrays.sort(P);
		int count=0;
		int sum=0;
		for(int i=0;i<N;i++) {
			count+=P[i];
			sum+=count;
		}
		System.out.println(sum);
	}

}
