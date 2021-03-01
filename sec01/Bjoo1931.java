package sec01;
import java.util.*;
public class Bjoo1931 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt(); //회의 수
		int h[][]=new int[N][2];
		int count=1;
		for(int i=0;i<N;i++) {
			h[i][1]=sc.nextInt();//시작하는 시각끝나는시각
			h[i][0]=sc.nextInt();//끝나는시각
		}
		
		Arrays.sort(h, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[0]==o2[0])
					return(o1[1]-o2[1]);
				else
					return(o1[0]-o2[0]);
			}
			
		});
		

		int f=h[0][0];//가장 빨리 끝나는시각
		int s=h[0][1];
		int i=1;
		while(true) {
			if(i==N)
				break;
			if(h[i][1]<f) {
				i++;
				continue;
			}else {
				f=h[i][0];
				count++; i++;
			}
		}
		System.out.println(count);

	}

}
