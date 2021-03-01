package sec01;
import java.util.*;
public class Bjoo20044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int w[] = new int[2*n];
		int g[]= new int[n];
		for(int i=0;i<2*n;i++) {
			w[i]=sc.nextInt();
		}
		
		Arrays.sort(w);
		
		for(int i=0;i<n;i++) {
			g[i]=w[i]+w[2*n-i-1];
		}
		
		Arrays.parallelSort(g);
		
		System.out.println(g[0]);
		
		sc.close();
	}

}
