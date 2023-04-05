import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());  
        int quarter = 25;  // 0.25$
        int dime = 10;  // 0.10$
        int nickel = 5;  // 0.05$
        int penny = 1;  // 0.01$
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int a = Integer.parseInt(br.readLine());
            sb.append(a / quarter + " ");
            a %= quarter;
            sb.append(a / dime + " ");
            a %= dime;
            sb.append(a / nickel + " ");
            a %= nickel;
            sb.append(a / penny + "\n");
        }
        System.out.print(sb);
    }
}