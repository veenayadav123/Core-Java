package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {

		HashMap map = new HashMap();

		map.put("1", "One");
		map.put(null, "Zero");
		map.put("0", null);
		map.put(null, null);

		map.put("1", "One");
		map.put("3", "Two");
		map.put("5", "Three");

		String val = (String) map.get("1");

		map.remove("4");

		Set keys = map.keySet();

		for (Object k : keys) {

			System.out.println(k);
		}

		Collection vals = map.values();

		for (Object v : vals) {

			System.out.println(v);

		}

		Set keyValue = map.entrySet();

		for (Object ele : keyValue) {

			Map.Entry pair = (Map.Entry) ele;

			System.out.println(pair.getKey() + "-" + pair.getValue());
		}

	}
}
