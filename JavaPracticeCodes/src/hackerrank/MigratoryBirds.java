package hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

	public static int migratoryBirds(List<Integer> arr) {
		// Write your code here
		Map<Integer, Integer> hm = new HashMap<>();
		int max = 0;
		int output = 0;
		for (int i = 0; i < arr.size(); i++) {

			if (hm.containsKey(arr.get(i))) {
				hm.put(arr.get(i), hm.get(arr.get(i)) + 1);
				continue;
			}
			hm.put(arr.get(i), 0);

		}

		for (Map.Entry<Integer, Integer> set : hm.entrySet()) {
			if (set.getValue() > max) {
				max = set.getValue();
				output = set.getKey();
			}
		}

		return output;
	}

	public static void main(String[] args) {

	}

}
