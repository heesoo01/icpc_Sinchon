package sec01;
import java.util.*;
public class Bjoo14659 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();//활잡이수
		int point=0;
		int kill=0;
		int max=0;
		int A[]=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		
		int i=1;			
		while(point+1<N) {
			if(point+i==N) {
				max=Math.max(kill, max);
				break;
			}
	         if(A[point]<=A[point+i]) {
	        	point=point+i;
	            max=Math.max(kill, max);
	            kill=0; i=1;
	         }
	         else{//>
	            i++; kill++;
	         }
	      }   
		System.out.println(max);
	}

}
