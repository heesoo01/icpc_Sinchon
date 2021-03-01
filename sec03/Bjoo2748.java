package sec03;
import java.util.*;
public class Bjoo2748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;
		int res=0;
		if(n==0) {
			System.out.println(a);
		}else if(n==1) {
			System.out.println(b);
		}else {
			for(int i=0;i<n-1;i++) {
				res=a+b;
				a=b;
				b=res;
			}
			System.out.println(res);
		}
		sc.close();
	}
}
