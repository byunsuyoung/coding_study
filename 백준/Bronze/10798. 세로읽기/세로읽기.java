import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();
        String[] arr = new String[5];

        for (int i = 0; i < arr.length; i++)
            arr[i] = br.readLine();

        for(int n = 0; n < 15; n++)
            for(int i = 0; i < 5; i++)
                if(n < arr[i].length())
                    str.append(arr[i].charAt(n));

        System.out.print(str);
        br.close();
    }
}