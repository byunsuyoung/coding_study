import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> lst = new ArrayList<Integer>();

		while (true) {
			lst.clear();
			final int num = Integer.parseInt(br.readLine());
			int sum = 0;

			if (num == -1) {
				break;
			}
			for (int i = 1; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					lst.add(i);
					lst.add(num / i);
					sum += i + num / i;
				}
			}
			sum -= num;
			if (sum == num) {
				System.out.print(num + " = 1");
				Collections.sort(lst); //정렬
				for (int i = 1; i < lst.size()-1; i++) {
					System.out.print(" + " + lst.get(i));
				}
				System.out.println();
			} else {
				System.out.println(num + " is NOT perfect.");
			}
		}
	}
}