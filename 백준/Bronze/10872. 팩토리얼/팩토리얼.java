import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
    
    	public static int fact(int N) {
		if(N <= 1) return 1;	
		return N * fact(N - 1);		
	}
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int sum = fact(N);
		System.out.println(sum);
		
	}
}