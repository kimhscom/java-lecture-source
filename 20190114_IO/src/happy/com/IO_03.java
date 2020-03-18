package happy.com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_03 {
	
	public static void main(String[] args) {
		int[] num = {1,4,-1,55,90};
		byte[] b = {51,52,53,54,55,23};

// C:\Happy_Eclipse\Workspace_java\20190114_IO\out.txt		
		try {
			FileOutputStream fout = new FileOutputStream("out.txt");
			
			for (int i = 0; i < num.length; i++) {
				fout.write(num[i]);
			}
			for (int i = 0; i < b.length; i++) {
				fout.write(b[i]);
			}
			fout.close();
			
			// 결과를 editor로 열어보면 출력
			// 파일에 저장된 값은 바이너리 코드로 저장 된다.
			// 이를 정수 값으로 출력하면 크기 및 byte에 의해 원하는 값이 출력 되지 않음.
			
			FileInputStream fin = new FileInputStream("out.txt");
			int c = 0;
			while ((c=fin.read())!=-1) {
				System.out.print(c+"");
			}
			fin.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n\n\n----------------------------");
		
		// java7 try resource with
		// DataOutStream를 사용하여 저장 해보자
		// 타입에 맞춰 가져와 보자
		
		try {
			DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
			out.writeInt(99);
			out.writeInt(200);
			out.writeBoolean(true);
			out.writeDouble(50.05);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 타입에 맞춰서 가져옴
		try {
			DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));
			try {
				// 순서대로 담김
				/*out.writeInt(99);
					out.writeInt(200);
					out.writeBoolean(true);
					out.writeDouble(50.05); 
				 */
				System.out.println(in.readInt());
				System.out.println(in.readInt());
				System.out.println(in.readBoolean());
				System.out.println(in.readDouble());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	/*
	 * File 객체
	 * byte 단위(I/O)
	 * 문자단위(Reader, Writer)
	 * 
	 * Byte 단위
	 * InputStream -> FileInputStream -> BufferedInputStream
	 * Output
	 * 
	 * 문자단위
	 * Reader -> FileReader -> BufferedReader
	 * Writer
	 */

}
