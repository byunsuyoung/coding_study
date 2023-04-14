import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a,b,c;
		
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c = Integer.parseInt(br.readLine());
		
		if(a == 60 && b == 60 && c == 60) { 
			System.out.println("Equilateral");
		}
		else if(a+b+c == 180 && a == b || a == c || b == c) { 
			System.out.println("Isosceles");
		}
		else if(a+b+c == 180 && a!=b && b!=c && c!=a) { 
			System.out.println("Scalene");
		}
		else {
			System.out.println("Error");
		}
		br.close();
	}
}