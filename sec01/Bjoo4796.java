package sec01;
import java.util.*;

public class Bjoo4796 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int i=1;
		while(true) {
			int L=sc.nextInt();
			int P=sc.nextInt();
			int V=sc.nextInt();
			if(L==0 && P==0 && V==0)
				break;
			int count=check(L,P,V);
			System.out.println("Case "+i+": "+count);
			i++;
		}
	}
	public static int check(int L,int P,int V) {
		int count=L*(V/P);
		if(V%P<L) {
			count+=V-(P*(V/P));
		}else {
			count+=L;
		}
		return count;
	}

}
