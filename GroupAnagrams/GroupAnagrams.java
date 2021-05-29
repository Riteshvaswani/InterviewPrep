import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*https://leetcode.com/problems/group-anagrams/
*/

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		String[] sortedString = new String[strs.length];
		for(int i = 0; i < strs.length; i++)
			sortedString[i] = sortString(strs[i]);
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for(int i = 0; i < sortedString.length; i++) {
			if(map.containsKey(sortedString[i]))
				map.get(sortedString[i]).add(strs[i]);
			else {
				List<String> value = new ArrayList<String>();
				value.add(strs[i]);
				map.put(sortedString[i], value);
			}
		}
		System.out.println(map.values().stream().collect(Collectors.toList()));
	}
	public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
