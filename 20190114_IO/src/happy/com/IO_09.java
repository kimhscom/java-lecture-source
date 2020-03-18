package happy.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IO_09 {
/*
 * 기본 파일에 글 추가
 */
	public static void main(String[] args) throws IOException { // Main에서 JVM이 자동으로 처리함.
		// 글을 추가적으로 입력할 Test.txt를 가져옴 <- 쓰기위해서
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Test.txt",true))); // true : 그 데이터 밑에다가 붙임
		
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 키보드에서 입력받음
//		String line = br.readLine();
		out.println(br.readLine()); // 출력하기 위해 out이라는 객체를 버퍼로 감싼다*/
		
		InputStreamReader in = new InputStreamReader(System.in); // 차이없음
		int c = 0;
		while ((c=in.read())!=10) {
			out.write(c);
		}
		out.flush();
		out.close();

	}

}
