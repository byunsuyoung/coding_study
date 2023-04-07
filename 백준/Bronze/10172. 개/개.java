import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("|\\_/|\n");
		bw.write("|q p|   /}\n");
		bw.write("( 0 )\"\"\"\\\n");
		bw.write("|\"^\"`    |\n");
		bw.write("||_/=\\\\__|"); 
		        
		bw.flush(); //현재 버퍼에 저장되어 있는 내용을 클라이언트로 전송하고 버퍼를 비운다.
		bw.close();
	}
}