package sec01;

import java.io.*;

public class pract {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a=br.read();
		
		bw.write(Integer.toString(1)+"\n");
		bw.write((1-'0')+"\n");
		bw.write((a-'0')+"\n");
		bw.write(Integer.toString(2)+"\n");
		bw.write((2-'0')+"\n");
		bw.flush();
		

	}

}
