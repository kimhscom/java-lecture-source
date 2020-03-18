package happy.com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/*
 * 버퍼를 파일 복사
 */
public class IO_08 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		Date d = null;
		
		// FileInputSteam으로 "StreamFile.txt" 파일의 객체를 생성 후
		// BufferedInputStream 객체를 생성한다.
		try {
			fis = new FileInputStream("StreamFile.txt");
			bis = new BufferedInputStream(fis);
			
			// FileOutputSteam으로 출력 파일을 "copyfile.txt" 객체 생성 후
			// BufferedOutputStream 객체를 생성
			fos = new FileOutputStream("copyfile.txt");
			bos = new BufferedOutputStream(fos);
			
			int i = 0;
			d = new Date();
			long start = d.getTime();
			
			// "StreamFile.txt"에서 1바이트씩 읽어서 버퍼에 담음
			try {
				while ((i=bis.read())!=-1) {
					// 1바이트씩 버퍼에 담음
					bos.write(i);
				}
				d = new Date();
				long end = d.getTime();
				System.out.println("복사 시간:"+(end-start));
				
				bos.flush();
				bos.close();
				fos.close();
				bis.close();
				fis.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
