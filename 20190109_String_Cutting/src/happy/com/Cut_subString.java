package happy.com;

// java.lang.String
public class Cut_subString {
	
	// 범위를 가지고 해당하는 문자열 -> 문자열 반환 : immutable
	// 오버로딩 int / int, int
	public void subSting() {
		String str = "Happy New Year";
		System.out.println("str 길이"+str.length());
		int idxStart = str.indexOf("New");
		System.out.println("New의 시작 index:"+idxStart);
		int idxEnd = str.lastIndexOf(32); // 32는 스페이스바(공백)
		System.out.println("공백(space)의 index:"+idxEnd);
		
		String newstr = str.substring(idxStart,idxEnd);
		String newStrEnd = str.substring(idxEnd);
		System.out.println(newstr);
		System.out.println(newStrEnd);
	}

}
