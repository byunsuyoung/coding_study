import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] cntSort = new int[10];

        while(N != 0){ // 자리수 만큼
            cntSort[N%10]++;  // 각 숫자가 몇 번 등장했는지 count
            N /= 10;
        }

        for(int i = 9; i >= 0; i--)
            while(cntSort[i] --> 0)
                sb.append(i);

        System.out.print(sb);
        br.close();
    }
}