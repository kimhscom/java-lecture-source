package happy.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_05 {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("happy.txt");
//			InputStreamReader in = new InputStreamReader(fin, "MS949"); // 읽어오기 때문에 reader (fin,"")
			InputStreamReader in = new InputStreamReader(fin, "UTF-8"); // 읽어오기 때문에 reader (fin,"")
			
			int c = 0;
			
			while ((c=in.read())!=-1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
