import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int sum = 1;
        for(int i =0; i < N; i++) {
            sum *= 2;
        }
        System.out.println(sum);
    }
}