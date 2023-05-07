import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int top = -1;	// 마지막 원소의 위치
		int K = Integer.parseInt(br.readLine());
		int[] arr = new int[K];
		
		for(int i = 0; i < K; i++) {
			int number = Integer.parseInt(br.readLine());	// 정수 입력
			if (number == 0) {	// 0 이라면 top 위치에 있는 원소를 0으로 초기화 
				top--;	// top이 가리키는 위치 1 감소
			} 
			else {
				top++;	
				arr[top] = number;	// 입력받은 정수로 초기화
			}
		}
		int sum = 0;
		for (int i = 0; i <= top; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}