import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
            
			if(A == 0 && B == 0 && C == 0) break;
			int MAX = Math.max(Math.max(A, B), C);
			if(MAX == A) {
				int sum = B + C;
				if(A >= sum) {
					System.out.println("Invalid");
					continue;
				}
			}
			if(MAX == B) {
				int sum = A + C;
				if(B >= sum) {
					System.out.println("Invalid");
					continue;
				}
			}
			if(MAX == C) {
				int sum = A + B;
				if(C >= sum) {
					System.out.println("Invalid");
					continue;
				}
			}
			if(A != B && A != C && B != C) { // 다 다를 때
				System.out.println("Scalene");
				continue;
			}
			if(A == B && A == C && B == C) { // 모두 같을 때
				System.out.println("Equilateral");
				continue;
			}
			if(A == B || A == C || B == C) { // 2개의 수만 같을 때
				System.out.println("Isosceles");
				continue;
			}
		}
	}
}