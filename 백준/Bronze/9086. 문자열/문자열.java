import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++){
            String tmp = br.readLine();
            str.append(tmp.charAt(0)).append(tmp.charAt(tmp.length()-1)).append("\n");
        }
        System.out.print(str);
        br.close();
    }
}