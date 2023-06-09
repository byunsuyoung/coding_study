import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int total = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i< count; i++){
            st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            total = total - (price * num);
        }
        if(total == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}