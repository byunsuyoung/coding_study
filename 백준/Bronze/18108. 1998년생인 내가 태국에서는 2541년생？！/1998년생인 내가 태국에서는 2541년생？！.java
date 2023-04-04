import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String y = br.readLine();	
		int year = Integer.parseInt(y);	
		
		System.out.println(year - 543);
	}
}