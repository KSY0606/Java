package javaSpecial;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 90);
		map.put("김철수", 80);
		map.put("이영희", 96);
		map.put("박찬호", 60);
		map.put("손흥민", 88);
		System.out.println("총 객체 수 : " + map.size());
		System.out.println(map.get("이영희"));  // 키(이영희)를 입력하면 값이 출력됨. 
		map.remove("김철수"); // 키를 입력하면 키와 값 전부 지워진다
		
		// HashMap데이터를 keySet메서드 처리
		/*Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}*/
		
		// HashMap데이터를 entry메서드 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator(); 
		while(entryIter.hasNext()) {
			Map.Entry<String, Integer> entry = entryIter.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}

}
