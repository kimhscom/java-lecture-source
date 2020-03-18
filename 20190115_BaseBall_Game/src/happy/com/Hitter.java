package happy.com;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Hitter extends ABasePlayer {
	
	public Hitter() {
		this(3);
	}
	
	public Hitter(int n) {
		super(n);
	}

	@Override
	public void make() {
		Arrays.fill(gong, 1);
		int n = gong.length;
		System.arraycopy(makeNum(), 0, gong, 0, n);
		
		while (true) {
			if (isSame()) { // 중복이면 true
				System.out.println("중복이 되었습니다. 재입력 하세요");
				System.arraycopy(makeNum(), 0, gong, 0, n);
			} else {
				break;
			}
		} 

	}
	
	private int [] makeNum() {
		int[] m = new int[gong.length];
		System.out.println("정수 3개의 숫자를 입력해주세요");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println("입력하신 숫자는?\t"+s);
		
		while (s.trim().equals("") || s.trim().length()!=gong.length) {
			System.out.println("다시 입력해주세요");
			s = scan.nextLine();
		}
		for (int i = 0; i < m.length; i++) {
//			m[i] = s.charAt(i)-'0';
			m[i] = Character.getNumericValue(s.charAt(i));
		}
		return m;
	}
	
	private boolean isSame() { // 중복이면 true
		boolean isc = false;
		int n = gong.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i!=j && gong[i]==gong[j]) {
					isc = true;
				}
			}
		}		
		return isc;
	}

}
