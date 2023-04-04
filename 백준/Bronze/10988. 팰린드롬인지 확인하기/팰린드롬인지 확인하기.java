import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(br.readLine());
 
        // 문자열이 같은지 검사할 때는 '=='이 아니라 equals() 메소드를 사용해야함.
        bw.write(((sb.toString().equals(sb.reverse().toString())) ? 1 : 0) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
 
}