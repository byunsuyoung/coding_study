import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cards_d = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<Integer, Integer> cards = new HashMap<>();
		for (int i = 0; i < cards_d; i++) {
			int card = Integer.parseInt(st.nextToken());
			cards.put(card, cards.getOrDefault(card, 0) + 1);
		}

		int testCases = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < testCases; i++) {
			int query = Integer.parseInt(st.nextToken());
			sb.append(cards.getOrDefault(query, 0)).append(" ");
		}
		System.out.println(sb);
	}
}