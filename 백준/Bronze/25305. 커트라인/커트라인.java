import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        int N = Integer.parseInt(st.nextToken()); // 응시자 수
        int k = Integer.parseInt(st.nextToken()); // 상받는 사람 수

        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
            list.add(Integer.parseInt(st.nextToken()));

        Collections.sort(list); // 정렬

        str.append(list.get(N-k));
        System.out.print(str);
        br.close();
    }
}