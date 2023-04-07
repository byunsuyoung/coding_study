import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //st.nextToken() 은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));      
    }
}