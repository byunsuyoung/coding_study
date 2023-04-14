import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int num = 666;
		int count = 1;
		while(count != N) {
			num++;
            // contains() : 해당 문자열 안에 검사하려는 문자열이 포함이 되어있는지를 검사하고, 
            //              검사하려는 문자열이 담겨있으면 true, 없으면 false 를 반환하는 메소드.
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		System.out.println(num);
	}
}