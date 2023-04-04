import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] A = new int[9][9];
		int max=0;
		int a=0;
		int b=0;
		
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				A[i][j]=Integer.parseInt(st.nextToken());
				if(max<=A[i][j]) {
					max=A[i][j];
					a=i+1;
					b=j+1;
				}
				
			}
		}
		System.out.println(max);
		System.out.println(a+" "+b);
	}
}