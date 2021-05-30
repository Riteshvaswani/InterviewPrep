import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/*https://leetcode.com/problems/minimum-window-substring/
*/

public class MinWindowSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bba", t = "ab";
		List<String> result = new ArrayList<String>();
		HashMap<Character, Integer> targetMap = calculateTargetMap(t);
		for(int i = 0; i < s.length(); i++) {
			if(targetMap.containsKey(s.charAt(i))) {
				@SuppressWarnings("unchecked")
				HashMap<Character, Integer> cloneMap = (HashMap<Character, Integer>) targetMap.clone();
				String response = calculateSlidingWindow(s, i, cloneMap);
				if(response != null && response != "")
					result.add(response);
			}
		}
		result.sort(Comparator.comparingInt(String::length));
		System.out.println((result != null && result.size() > 0) ? result.get(0) : "");
	}
	
	public static HashMap<Character, Integer> calculateTargetMap(String t) {
		HashMap<Character, Integer> result = new HashMap<Character, Integer>();
		for(int i = 0; i < t.length(); i++) {
			if(result.containsKey(t.charAt(i)))
				result.put(t.charAt(i), result.get(t.charAt(i)) + 1);
			else
				result.put(t.charAt(i), 1);
		}
		return result;
	}
	
	public static String calculateSlidingWindow(String s, int startIndex, HashMap<Character, Integer> map) {
		int count = 0, i = startIndex;
		for(; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				int mapCount = map.get(s.charAt(i));
				map.put(s.charAt(i), mapCount - 1);
				if((mapCount -1 ) == 0)
					count ++;
			}
			if(count == map.size())
				break;
		}
		return (count == map.size()) ? s.substring(startIndex, i+1) : "";
	}

}