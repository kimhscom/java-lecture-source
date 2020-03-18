package happy.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JCF_Sample {
	
	public void iterator() {
		// iterator는 순서가 중복이 없을 경우 값을 찾아서 출력하는 방식
		Set<String> setValues = new HashSet<String>();
		setValues.add("happy");
		setValues.add("com");
		setValues.add("labc");
		
		// DB있는 값을 저장할 때 사용 : 객수가 변함, 중복되는 값도 없음 -> List
		Iterator<String> iter =setValues.iterator(); // iterator pattern을 통해서 출력 해야함
		while (iter.hasNext()) {
			String string = (String) iter.next();
			System.out.println(string);
		}
		
//		setValues.clear(); // 덮어쓰기가 안되기때문에 리스트를 비운다.
		
		Map<String, String> mapValues = new HashMap<String, String>();
		mapValues.put("cocoa", "코코아가루를 물과 1:3으로 섞은 음료");
		mapValues.put("coffee", "커피콩의 씨를 태워서 가루를 내고 그 물을 마심");
		mapValues.put("ice", "H2O를 기압과 온도의 상태변화를 통한 형태");
		
		mapValues.get("cocoa");
		
		Set<String> setMapKey = mapValues.keySet();
		Iterator<String> iterMapKey = setMapKey.iterator();
		while (iterMapKey.hasNext()) {
			String str = (String) iterMapKey.next();
			System.out.println("메뉴:"+str+":"+mapValues.get(str));
		}
		
	}
	
	public void set() {
	Set<String> set = new HashSet<String>();
	set.add("바람");
	set.add("하늘");
	set.add("별");
	// 출력 없음(Iterator Design Pattern 사용해야 함)
	System.out.println(set.size());
	
	// set은 기준이 없기 때문에 Object
//	set.remove("바람");
//	System.out.println();
//	System.out.println(set.size());
	boolean isc = set.contains("별");
	System.out.println(isc);
	
	
	}
	
	public void list() {
		List<String> list = new ArrayList<String>();
		list.add("바람");
		list.add("별");
		list.add("꿈");
		String get1 = list.get(1); // index(int) 번호만 가능함
		System.out.println(get1);
		System.out.println(list.size());
		
		// 삭제 자동 생성된 index와 값으로 삭제 가능
//		list.remove(0);
//		list.remove("별");
//		System.out.println(list.size());
		boolean isc = list.contains("별");
		System.out.println(isc);
		
		int a = list.indexOf("별");
		System.out.println(a);
		
	}
	
	public void map() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("주형", 111);
		map.put("태규", 999);
//		int get111 = map.get(111); // Object key 값
		int get주형 = map.get("주형"); // Object key 값
//		System.out.println(get111+"::"+get주형);
		System.out.println("::"+get주형);
		
		// set은 newValue에 대해서 입력하지 않고 oldValue를 유지한다 <-> map은 반대
		map.put("주형", 2222);
//		System.out.println("::"+map.get("주형"));
		System.out.println(map.size());
		
		/*
		 * 새로운 객체는 같은 key라면 새로운 값으로 변경
		 * Map<String,Integer> m = new hashMap<String,Ineger>();
		 * map.put("A", 1); // @
		 * map.put
		 */		
		
		// 삭제
//		map.remove("주형");
//		map.remove("태규", 888);
//		System.out.println(map.size());
		
		boolean isc = map.containsKey("주형");
		boolean iscVal = map.containsValue(999);
		
		System.out.println(isc);
		System.out.println(iscVal);
		
	}

}
