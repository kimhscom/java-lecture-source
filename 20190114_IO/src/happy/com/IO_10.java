package happy.com;

import java.io.File;

/*
 * 파일 클래스 활용
 * 파일 클래스를 통해 파일 타입을 알아 냄
 * 디렉터리를 나열
 * 파일 이름을 변경
 */
public class IO_10 {
	
	public static void main(String[] args) {
		File f1 = new File("C:\\Happy_Eclipse\\eclipse\\eclipse.ini");
		File f2 = new File("C:\\temp\\Sample");
		File f3 = new File("C:\\temp");
		
		String res; // 파일 저장
		if (f1.isFile()) { // 파일이냐?
			res = "파일";
		} else { // 디렉터리냐?
			res = "디렉터리";
		}		
		System.out.println(f1.getPath() + "은" + res + "입니다.");
		
		if (f2.exists()) { // f2가 존재하는 검사
			if (!f2.mkdir()) { // 디렉터리를 생성
				System.out.println("디렉터리 생성 실패");
			} 
		} else {
			System.out.println("존재 합니다.");
		}
		
		if (f2.isFile()) { // 파일이냐?
			res = "파일";
		} else { // 디렉터리냐?
			res = "디렉터리";
		}
		
		System.out.println(f2.getPath() + "은" + res + "입니다.");
		dir(f3); // C:\\temp에 있는 파일과 디렉터리를 화면에 출력
		
		f2.renameTo(new File("C:\\temp\\새 폴더"));
		dir(f3);
		
	}
	
	// 디렉터리에 포함된 파일과 디렉터리의 이름
	// 크기, 수정시간을 출력하는 메소드

	public static void dir(File fd) {
		String[] fileName = fd.list();
		for (String s : fileName) {
			File f = new File(fd, s);
			long t = f.lastModified(); // 마지막으로 수정된 시간
			System.out.println("\t파일크기 :" + f.length()); // 파일크기
			System.out.printf("\t수정한 시간 : %tb %td %ta %tT\n",t,t,t,t);
		}

	}

}
