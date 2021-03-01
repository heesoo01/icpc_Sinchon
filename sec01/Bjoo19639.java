package sec01;
import java.io.*;
import java.util.*;
import java.util.stream.*;
public class Bjoo19639 {

   public static void main(String[] args) throws NumberFormatException, IOException {
      // TODO Auto-generated method stub
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringTokenizer st= new StringTokenizer(br.readLine());
      int X=Integer.parseInt(st.nextToken());//적의 수
      int Y=Integer.parseInt(st.nextToken());//회복 아이템 수
      int M=Integer.parseInt(st.nextToken());//준석이 체력
      int x[]=new int[X];
      int y[]=new int[Y];
      
      for(int i=0;i<X;i++)
         x[i]=Integer.parseInt(br.readLine());
      for(int i=0;i<Y;i++)
         y[i]=Integer.parseInt(br.readLine());
      
      int xcount=0, ycount=0;
      
      if(M+IntStream.of(y).sum()<=IntStream.of(x).sum()) {//준석이가 지는 경우
    	  bw.write(Integer.toString(0)+"\n"); bw.flush();
          System.exit(0);
      }
      
      for(int i=0;i<X+Y;i++) {
          if(X==0&&Y>=1) {//준석이가 싸울 적이 0이고 회복아이템이 1개이상일 경우
        	  bw.write(Integer.toString(++ycount)+"\n"); bw.flush();
        	  continue;
          }
          if(xcount<X) {
        	  if(M<=x[xcount]) {//남아있는 체력이 같거나 더 적은 경우
        		  M+=y[ycount++];//회복 아이템을 하나 먹는다.
        		  bw.write(Integer.toString(ycount)+"\n"); bw.flush();
        	  }else {//남아있는 체력이 더 큰 경우
        		  M-=x[xcount++];//적 하나를 죽인다.
        		  bw.write(Integer.toString(-xcount)+"\n"); bw.flush();
        	  }
          }else{//더이상 적이 안남아있는 경우
        	  if(ycount<Y)
        		  bw.write(Integer.toString(++ycount)+"\n"); bw.flush();  
          }
       }
   }
}