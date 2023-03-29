import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int max = 0;
		int min = 0;
		for(int i = 0 ; i < 9 ; i++) {
 
			int val = Integer.parseInt(br.readLine());
			
			if(val > max) {
				max = val;
				min = i+1;
			}
		}
 
		System.out.println(max);
		System.out.println(min);
	}
}