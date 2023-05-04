import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
		while(N-- > 0) {
			int a = Integer.parseInt(st.nextToken());
			max = a > max ? a : max;
			min = a < min ? a : min;
		}
		System.out.println(max * min);
	}
}