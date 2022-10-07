package Page1;
import java.util.HashMap;
public class CountNumOfChar {
	static void characterCount(String inputString) {
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
		System.out.println(hash_map);
	}
	public static void main(String[] argrs) {
		characterCount("Optimus");
	}
}
