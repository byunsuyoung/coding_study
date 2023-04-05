import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.math.BigInteger; //long 보다 큰 수(문자열형태로 이루어져 있음)
 
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); //공백기준으로 문자열 쪼개는
		
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		
		A = A.add(B); //add 메서드를 사용하면 BigInteger 인스턴스끼리 더하기 연산을 할 수 있음. 
		
		System.out.println(A.toString());
	}
}