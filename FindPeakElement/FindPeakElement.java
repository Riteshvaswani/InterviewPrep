
/*https://leetcode.com/problems/find-peak-element/
*/

public class FindPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1};
		int i = 1;
		if(nums.length > 1 && nums[i-1] > nums[i])
			System.out.println(i-1 + "-" + nums[i-1]);
		for(; i < nums.length-1; i++) {
			if(nums[i] > nums[i-1] && nums[i] > nums[i+1])
				System.out.println(i + "-" + nums[i]);
		}
		if(nums.length > 1 && nums[i] > nums[i-1])
			System.out.println(i + "-" + nums[i]);
		System.out.println("0");
	}

}
