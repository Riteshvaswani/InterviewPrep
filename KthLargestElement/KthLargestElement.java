public class KthLargestElement {
	public static void main(String[] args) {
		int[] nums = {3,2,7,1,2,4,6};
		int target = 2;
		quicksort(nums, 0, nums.length-1);
		System.out.println(nums[nums.length-target]);
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
