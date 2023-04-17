import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;  
        int mid = 0;  
        int[] list = new int[5];
        
        for (int i = 0; i < 5; i++) {
            list[i] = Integer.parseInt(br.readLine());
            sum += list[i];
        }
        Arrays.sort(list);  //오름차순으로 정렬
        int avg = sum / 5;  //평균 구하기
        mid = list[2];
        System.out.print(avg + "\n" + mid);
    }
}