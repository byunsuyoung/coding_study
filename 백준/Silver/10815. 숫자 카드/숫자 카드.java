import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 가지고 있는 카드 개수
        HashSet<Integer> set = new HashSet<>(); // 중복 불가, 값의 유무 파악(값이 있으면 true 없으면 False)

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken()); //주어진 카드 개수

        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < M; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (set.contains(a)) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
    }
}