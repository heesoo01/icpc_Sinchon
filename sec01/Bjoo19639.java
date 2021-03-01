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
      int X=Integer.parseInt(st.nextToken());//���� ��
      int Y=Integer.parseInt(st.nextToken());//ȸ�� ������ ��
      int M=Integer.parseInt(st.nextToken());//�ؼ��� ü��
      int x[]=new int[X];
      int y[]=new int[Y];
      
      for(int i=0;i<X;i++)
         x[i]=Integer.parseInt(br.readLine());
      for(int i=0;i<Y;i++)
         y[i]=Integer.parseInt(br.readLine());
      
      int xcount=0, ycount=0;
      
      if(M+IntStream.of(y).sum()<=IntStream.of(x).sum()) {//�ؼ��̰� ���� ���
    	  bw.write(Integer.toString(0)+"\n"); bw.flush();
          System.exit(0);
      }
      
      for(int i=0;i<X+Y;i++) {
          if(X==0&&Y>=1) {//�ؼ��̰� �ο� ���� 0�̰� ȸ���������� 1���̻��� ���
        	  bw.write(Integer.toString(++ycount)+"\n"); bw.flush();
        	  continue;
          }
          if(xcount<X) {
        	  if(M<=x[xcount]) {//�����ִ� ü���� ���ų� �� ���� ���
        		  M+=y[ycount++];//ȸ�� �������� �ϳ� �Դ´�.
        		  bw.write(Integer.toString(ycount)+"\n"); bw.flush();
        	  }else {//�����ִ� ü���� �� ū ���
        		  M-=x[xcount++];//�� �ϳ��� ���δ�.
        		  bw.write(Integer.toString(-xcount)+"\n"); bw.flush();
        	  }
          }else{//���̻� ���� �ȳ����ִ� ���
        	  if(ycount<Y)
        		  bw.write(Integer.toString(++ycount)+"\n"); bw.flush();  
          }
       }
   }
}