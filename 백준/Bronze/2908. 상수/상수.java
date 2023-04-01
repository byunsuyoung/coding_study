import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer: 문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        //reverse() : 배열 순서 반전
		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.print(A > B ? A:B);
    }
}