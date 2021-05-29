
/*https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
*/

public class FindFirstLastPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {};
		int target = 6;
		int firstIndex = -1, lastIndex = -1;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == target) {
				firstIndex = i;
				int k = i+1;
				for(; k < nums.length; k++) {
					if(nums[k] != target)
						break;
				}
				lastIndex = k-1;
				break;
			}
		}
		System.out.println(firstIndex + " " + lastIndex);
	}

}
