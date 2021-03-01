package sec02;

import java.util.*;
public class Bjoo1018 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		char m[][]=new char [N][M];
		sc.nextLine();
		for(int i=0;i<N;i++) {
			m[i]=sc.nextLine().toCharArray();
		}
		
		int res=(int)1e9, ans=(int)1e9;
		for(int a=0;a<=N-8;a++) {
			for(int b=0;b<=M-8;b++) {
				int num1=0;//Â¦¼ö:W È¦¼ö:B
				int num2=0;//È¦¼ö:W Â¦¼ö:B
				for(int i=a;i<a+8;i++) {
					for(int j=b;j<b+8;j++) {
						if(m[i][j]=='W') {
							if((i+j)%2==0)
								num2++;//Â¦¼ö´ÂB W->B
							else
								num1++;//È¦¼ö´ÂB W->B
						}else {//B
							if((i+j)%2==0)
								num1++;//Â¦¼ö´Â W B->W
							else
								num2++;//È¦¼ö´Â W B->W
						}
					}
				}
				//System.out.println(num1+"|"+num2);
				ans=Math.min(num1, num2);
				res=Math.min(res,ans);
			}
		}
		System.out.println(res);

	}

}
