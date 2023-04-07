import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
        //대각선 개수, 직전 대각선 누적합
		int cross_count = 1, pre_count_sum = 0;
 
		while (true) {
			if (x <= pre_count_sum + cross_count) {	
				if (cross_count % 2 == 1) {	// 홀수 일 때 
					// 분자 큰 수부터 
					// 분자는 대각선상 블럭의 개수 - (x 번째 - 직전 대각선까지의 블럭 개수 - 1) 
					// 분모는 x 번째 - 직전 대각선까지의 블럭 개수
					System.out.print((cross_count - (x - pre_count_sum - 1)) + "/" + (x - pre_count_sum));
					break;
				} 
				else {	// 짝수 일 때 
					//출력을 반대로 
					System.out.print((x - pre_count_sum) + "/" + (cross_count - (x - pre_count_sum - 1)));
					break;
				}
			} else {
				pre_count_sum += cross_count;
				cross_count++;
			}
		}
	}
}