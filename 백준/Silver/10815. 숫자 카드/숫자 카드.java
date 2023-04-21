import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
 
        public static int binarySearch(int[] cards, int N, int search) { // 이진탐색
        int start = 0;
        int end = N - 1;
        int mid = 0;
 
        while (start <= end) {
            mid = (start + end) / 2; // 중간 인덱스
 
            if (cards[mid] == search) { // 중간값과 찾으려는 수가 같은 경우
                return 1;
            }
 
            if (cards[mid] < search) { // 배열 우측
                start = mid + 1;
            } else { // 배열 좌측
                end = mid - 1;
            }
        }
 
        return 0;
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
 
        int N = Integer.parseInt(br.readLine()); // 카드의 개수
        int[] cards = new int[N];
 
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
 
        Arrays.sort(cards); // 이분탐색할 배열은 정렬되어 있어야 한다.
        int M = Integer.parseInt(br.readLine()); // 구별할 수의 개수
 
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int temp = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(cards, N, temp) + " ");
        }
 
        bw.write(sb.toString() + "\n");
        // 버퍼를 잡아 놓았기 때문에 반드시 flush() / close() 를 반드시 호출해 주어 뒤처리를 해주어야 한다.
        bw.flush(); 
        bw.close();
        br.close();
    }
}