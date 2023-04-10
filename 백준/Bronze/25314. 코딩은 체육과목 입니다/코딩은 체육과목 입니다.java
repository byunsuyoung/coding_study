import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int l_num = N / 4;
        // repeat: 문자열 반복 메서드
        System.out.print("long ".repeat(l_num) + "int");
    }
}