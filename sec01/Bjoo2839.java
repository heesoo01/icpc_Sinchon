package sec01;
import java.util.*;
public class Bjoo2839 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		double a=0.0,b=0.0;
		int N=sc.nextInt();
		int min=-1;
		
	
		
		while(true) {
			double result = a+((double)N-3*a)/5.0;
			if(a<0||N-3*a<0)
				break;
			if(result-((int)(result/1))==0.0) {
				min=(int)result;
				break;
			}else {
				a++;
			}
		}
		System.out.println(min);
		
	}

}
