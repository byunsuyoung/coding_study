import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    
     public static boolean isNum(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        HashMap<Integer, String> map_number = new HashMap<>();
        HashMap<String, Integer> map_name = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            map_number.put(i, name);
            map_name.put(name, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= m; i++) {
            String tmp = br.readLine();
            if(isNum(tmp)){
                sb.append(map_number.get(Integer.parseInt(tmp))+"\n");
            }else{
                sb.append(map_name.get(tmp)+"\n");
            }
        }
        System.out.println(sb);
    }
}