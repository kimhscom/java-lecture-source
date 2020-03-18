package happy.com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 데이터 파일 복사
 */
public class IO_12 {

	public static void main(String[] args) {
		File src = new File("C:\\Windows\\explorer.exe"); // 소스파일
		File dst = new File("C:\\temp\\explorer.bin"); // 목적파일

		FileInputStream fi = null;
		FileOutputStream fo = null;

		BufferedInputStream in = null;
		BufferedOutputStream out = null;

		int c;

		try {
			fi = new FileInputStream(src);
			fo =  new FileOutputStream(dst);

			in = new BufferedInputStream(fi);
			out = new BufferedOutputStream(fo);


			while ((c=in.read())!=-1) {
				out.write(c);
			}
			in.close();
			out.close();
			fi.close();
			fo.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
