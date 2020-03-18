package happy.com;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_06 {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		FileWriter fout = null;
		
		int c;
		try {
			fout = new FileWriter("inputValue.txt");
			// 키보드로 입력 받은 값을 byte로 변경하고 그 값을 입력
			while ((c=in.read())!=10) { // 엔터(13)를 입력 후 다음줄 빈 첫번째 칸(10) 
				fout.write(c);
			}
			fout.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
