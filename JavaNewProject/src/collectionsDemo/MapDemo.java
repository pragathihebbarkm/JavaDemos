package collectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> marks = new HashMap<>();
		marks.put("Bob", 89);
		marks.put("John", 78);
		marks.put("Steve", 92);
		marks.put("Sirius", 88);
		marks.put("Tom", 79);
		System.out.println(marks);
		System.out.println(marks.keySet());
		System.out.println(marks.values());
		
		for(String key : marks.keySet()) {
			System.out.println(key);
		}
		
		Map<String, Integer> NewMarks = new LinkedHashMap<>();
		NewMarks.put("Bob", 89);
		NewMarks.put("John", 78);
		NewMarks.put("Steve", 92);
		NewMarks.put("Sirius", 88);
		NewMarks.put("Tom", 79);
		System.out.println(NewMarks);
	}
}
