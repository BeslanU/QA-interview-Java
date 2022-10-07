package Page1;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicate {
	static void duplicateChars(String inputString) {
		HashMap<Character, Integer> hash_map = new HashMap<>();
		char[] strArray = inputString.toCharArray();
		for (char c : strArray) {
			if (hash_map.containsKey(c)) {
				hash_map.put(c, hash_map.get(c) + 1);
			}
			else {
				hash_map.put(c, 1);
			}
		}
		Set<Character> keys = hash_map.keySet();
		for (char c : keys) {
			if (hash_map.get(c) > 1) {
				System.out.println(c + "-->" + hash_map.get(c));
			}
		}
	}
	public static void main(String[] argrs) {
		duplicateChars("OptimusPrime");
	}
}
