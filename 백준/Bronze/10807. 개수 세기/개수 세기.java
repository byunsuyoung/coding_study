import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int [] array = new int[num];
		int cnt = 0;
		for(int i =0; i < num; i++) {
			array[i] = scan.nextInt();
		}
		
		int v = scan.nextInt();
		for (int i=0;i<array.length; i++) {
			if(v == array[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}