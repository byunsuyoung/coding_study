import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();
        
        str.append(Long.parseLong(br.readLine())*4);
        System.out.print(str);
        br.close();
    }
}