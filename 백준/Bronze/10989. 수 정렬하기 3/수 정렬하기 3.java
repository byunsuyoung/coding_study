import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cnt = new int[10001]; // 수의 범위 (0 ~ 10000)
        int N = Integer.parseInt(br.readLine());
 
        for (int i = 0; i < N; i++) { // 각 원소 개수 저장
            cnt[Integer.parseInt(br.readLine())] ++;
        }
        br.close();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < 10001; i++){
            while(cnt[i] > 0){ // i 값이 개수가 0 이 될 때 까지
                sb.append(i).append('\n');
                cnt[i]--; // 중복데이터가 있으므로 
            }
        }
        System.out.println(sb);
    }
}