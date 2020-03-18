package happy.com;

import java.util.Scanner;

public class BaseBall_Inval {
	
	// ch true 중복 체크
	public int[] inputBox(int len, int start, int end, boolean ch) {
		int[] box = null; // 배열 초기값은 null로 한다
		if (ch) {
			while (true) { // 중복을 확인하기 위해 조건을 true로 한다
				int[] tempBox = inputBox(len, start, end);
				if (!arrayCheck(tempBox)) {
					System.out.println("중복된 값이 있습니다.");
				} else {
					box = tempBox.clone();
					break;
				}
			} 
		} else {
			box = inputBox(len, start, end).clone();
		}
		return box;
	}
	
	// 배열에 값을 입력 하는 메소드
		private int [] inputBox(int len, int start, int end) { // len배열의 크기, 시작숫자~끝숫자
			int[] box = new int[len];
			int idx = 0; // 입력이 완료된 배열의 index // 종료조건
			
			while (true) {
				try {
					// ?? 입력 정확하게 start~end 까지(validation), 정확한 정수(Exception)
					System.out.println((idx + 1) + "에 배열에 값을 넣어주세요");
					Scanner scan = new Scanner(System.in);
					int n = scan.nextInt(); // 사용자가 입력을 잘못했을 경우 InputMisMatchException이 발생이 예상

					// validation 처리
					if (n >= start && n <= end) {
						box[idx] = n;
						idx++; // 입력되는 배열의 index 번호
					} else {
						System.out.println("-----------------범위를 벗어 났습니다");
					}
					
					if (idx>=len) {
						System.out.println("-----------------입력 완료 수고하셨습니다.");
						break;
					}

				} catch (Exception e) {
					//			e.printStackTrace();
					System.out.println("---------------잘못된 형식으로 입력 하셨습니다.------------------");
				} 
			} // while
			return box;
			
		}
	
	// 중복이라면 false, 중복이 없다면 true
	private boolean arrayCheck(int[] inBox) {
		boolean isc = true;
		for (int i = 0; i < inBox.length; i++) {
			for (int j = 0; j < inBox.length; j++) {
				if (i != j && inBox[i]==inBox[j]) {
					isc = false;
				}
			}
		}
		
		return isc;
	}
	
	

}
