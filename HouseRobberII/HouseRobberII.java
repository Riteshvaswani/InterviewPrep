
public class HouseRobberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1,2};
		if(nums.length == 1)
			System.out.println(nums[0]);
        System.out.println(Math.max(rob(nums, 0 , nums.length-1), rob(nums, 1, nums.length)));
	}
	public static int rob(int[] nums, int start, int end) {
        int prevTwo = 0, prevOne = 0, max = 0;
        for(int i = start; i < end; i++) {
            max = Math.max(prevTwo + nums[i], prevOne);
            prevTwo = prevOne;
            prevOne = max;
        }
        return max;
    }
}
