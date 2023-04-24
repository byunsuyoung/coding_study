import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder str = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String,Character> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        for (int n = 0; n < N; n++)
            map.put(br.readLine(), ' ');

        for (int m = 0; m < M; m++) {
            String tmp = br.readLine();
            if(map.containsKey(tmp))
                list.add(tmp);
        }

        Collections.sort(list); 

        str.append(list.size()).append("\n"); //list.size(): 길이 알아보고자 할때
        for(String s : list)
            str.append(s).append("\n");

        System.out.print(str);
        br.close();
    }
}