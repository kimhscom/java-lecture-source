package happy.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 파일이 단위 byte 바이트 스트림 클래스를 사용하면 된다
 * ByteStream 바이트단위의 바이너리 값을 읽고 쓰는 스트림
 * 
 * InputStream / outputStream
 * FileInputStream / FileOutputStream
 * DataInputStream / DataOutput Stream
 */

public class IO_02 {

	// 02 예제
	// 파일 전체를 읽어서 화면에 출력하는 코드
	// C:\Windows\system.ini
	public static void main(String[] args) {

		try {
			//	FileInputStream fin = new FileInputStream("Test.txt");
			FileInputStream fin = new FileInputStream("C:\\Windows\\system.ini");

			int c;
			try {
				while ((c=fin.read())!=-1) {
					System.out.print((char)c);
				}

				fin.close();

			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("입출력 오류가 발생 하였습니다.");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}

