import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] c_1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine(), " ");
        int[] c_2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine(), " ");
        int[] c_3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        
        int x,y;
        // x좌표 비교
        if(c_1[0] == c_2[0]) { //1번 x좌표와 2번 x좌표가 같으면
            x = c_3[0];
        }
        else if(c_1[0] == c_3[0]) { //1번 x좌표와 3번 x좌표가 같으면
            x = c_2[0];
        }
        else { //2번 x좌표와 3번 x좌표가 같으면
            x = c_1[0];
        }
        // y 좌표 비교
		if (c_1[1] == c_2[1]) { // 1번 y좌표와 2번 y좌표가 같으면
			y = c_3[1];
		}
		else if (c_1[1] == c_3[1]) { // 1번 y좌표와 3번 y좌표가 같으면
			y = c_2[1];
		}
		else { // 2번 y좌표와 3번 y좌표가 같으면
			y = c_1[1];
		}
		System.out.println(x + " " + y);
    }
}