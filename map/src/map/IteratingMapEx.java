package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratingMapEx {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("sravani", 14);
		map.put("thota", 14);
		map.put("sravz", 11);
		System.out.println(map);
		Set<String> keys = map.keySet();
		
		//1st approach
		/*Iterator<String> it = keys.iterator();

		while(it.hasNext()) {
			String strKey = it.next();
			Integer value = map.get(strKey);
			System.out.println(strKey   + "  " + value);
		}*/
		
	//second approach
		Set<Entry<String,Integer>> entries =  map.entrySet();
		Iterator<Entry<String,Integer>> itr = entries.iterator();
		while(itr.hasNext()) {
			Entry entry = itr.next();
			System.out.println(entry.getKey() 
					+ " " + entry.getValue());
		}
	}

}

