import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> set = new HashSet<>();
		int n = Integer.parseInt(br.readLine());	
		set.add("ChongChong");
		
		while(n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			if(set.contains(a) && !set.contains(b)) {
				set.add(b);
			}
			else if(!set.contains(a) && set.contains(b)) {
				set.add(a);
			}
		}
		System.out.println(set.size());
		br.close();	
	}
}