import java.util.ArrayList;
import java.util.List;

/*https://leetcode.com/problems/majority-element-ii/
*/

public class MajorityElementII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,3,1,3,1,3,1,3,4,4,4,4,4,5,5,6,6,6,6,6,9,9,9,9,9,9,9,3,3,3,3,3,3,3,3,3};
		List<Integer> result = new ArrayList<Integer>();
		int threshold = nums.length/3, count = 0, lastNum = -1;
		quicksort(nums, 0, nums.length-1);
		for(int i = 0; i < nums.length; i++) {
			lastNum = nums[i];
			count = 0;
			int k = i;
			for(; k < nums.length;) {
				if(lastNum == nums[k]) {
					count++;
					k++;
				}
				else {
					k--;
					break;
				}
					
			}
			i = k;
			if(count > threshold)
				result.add(lastNum);
		}
		System.out.println(result);
	}
	
	public static void quicksort(int[] nums, int low, int high) {
        int i = low, j = high;
        int pivot = nums[low + (high-low)/2];

        while (i <= j) {
            while (nums[i] < pivot) {
                i++;
            }
            while (nums[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(nums, i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(nums, low, j);
        if (i < high)
            quicksort(nums, i, high);
    }
	
	public static void exchange(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
