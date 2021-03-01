package sec03;
import java.util.*;

public class Bjoo15988 {
	
	public static long[] sum=new long[1000010];
	public static long sum(int n) {
		if(sum[n]!=-1) 
			return sum[n];
		if(n<3) return sum[n]=n;
		if(n==3) return sum[n]=4;
		return sum[n]=sum(n-1)+sum(n-2)+sum(n-3);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(); //테스트케이스 개수
		int arr[]=new int[T];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<sum.length;i++) {
			sum[i]=-1;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(sum(arr[i])%100000009);
		}
		

	}


}
