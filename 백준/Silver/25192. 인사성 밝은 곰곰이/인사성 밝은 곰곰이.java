import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> hashSet = new HashSet<>();
        int cnt = 0;
        while (N-- > 0) {
           String p = br.readLine();
           if(p.equals("ENTER")) {
               hashSet = new HashSet<>();
               continue;
           }
           if(!hashSet.contains(p)) {
               hashSet.add(p);
               cnt++;
           }
       }
        System.out.println(cnt);
    }
}