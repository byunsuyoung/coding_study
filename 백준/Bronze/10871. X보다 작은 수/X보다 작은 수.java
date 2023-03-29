import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
        
		StringBuilder b = new StringBuilder();
 
		for(int i = 0 ; i < N ; i++) {
			int value = scan.nextInt();
			if(value < X) {
				b.append(value+" ");
			}
		}
		System.out.println(b);	
	}
}