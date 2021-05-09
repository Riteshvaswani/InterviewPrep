import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*https://leetcode.com/problems/sliding-window-maximum/
*/

public class MaxSlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		List<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i <= nums.length-k; i++)
			result.add(Arrays.stream(Arrays.copyOfRange(nums, i, i+k)).max().getAsInt());
		System.out.println(result);
		//System.out.println(result.parallelStream().mapToInt(i -> i).toArray());
	}
}
