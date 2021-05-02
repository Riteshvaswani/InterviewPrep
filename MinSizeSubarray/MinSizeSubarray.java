public class MinSizeSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 5;
		int[] nums = { 1, 2, 3, 4, 5 };
		int result = 0, size = 0;
		long sum = 0;
		while (size <= nums.length) {
			System.out.println("----" + size + "----");
			for (int i = 0; i <= nums.length - size; i++) {
				sum = 0;
				System.out.println("Starting: " + i + " to " + (i + size));
				for (int j = i; j < i + size; j++) {
					sum += nums[j];
				}
				if (sum >= target) {
					result = size;
					break;
				}
			}
			if (sum >= target) {
				result = size;
				break;
			}
			size++;
		}
		System.out.println(result);
	}
}
