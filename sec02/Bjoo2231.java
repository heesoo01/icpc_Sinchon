package sec02;
import java.util.*;

public class Bjoo2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int length=(int)(Math.log10(N)+1); //ÀÚ¸®¼ö
		int res=(int) (Math.pow(10, length-1))-(int)Math.pow(10, length-2);
		while(true) {
			if(res>N) {
				res=0;
				break;
			}
			if(cal(res,(int)Math.log10(res)+1)==N)
				break;
			else {
				res++;
			}
		}
		System.out.println(res);
		
		
		

	}
	public static int cal(int k,int length) {
		int p=(int)Math.pow(10, length-1);
		int sum=k/p, a=k, b=p;
		for(int i=1;i<length;i++) {
			a=a%p;
			b=p/10;
			sum+=a/b;
			p=p/10;
		}
		return sum+k;
	}
	

}
