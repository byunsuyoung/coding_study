import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int d = 2; //처음 점 개수
		
		for(int i = 0; i < n; i++) {
			d += (d - 1);
		}
		System.out.println(d * d);
	}

}