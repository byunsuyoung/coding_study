import java.io.*;
import java.util.StringTokenizer;

public class Main {
 
    // 유클리드 호제법
    public static int gcd(int a, int b) {
        // a가 b보다 큰 경우에 대해서 유클리드 호제법 수행.
        if (a <= b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b , a % b);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int numerator = a * d+ b * c;
        int denominator = b * d;
        
        int mod = gcd(numerator, denominator);
        numerator /= mod;
        denominator /= mod;

        bw.write(numerator + " " + denominator + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}