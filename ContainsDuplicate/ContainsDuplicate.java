import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1,5};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				System.out.println("Duplicate");
			}
			map.put(nums[i], nums[i]);
		}
	}
}
