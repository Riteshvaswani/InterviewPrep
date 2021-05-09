import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*https://leetcode.com/problems/kth-smallest-element-in-a-bst/
*/

public class KthSmallestBST {
	static List<Integer> treeList = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 1;
		TreeNode left = new TreeNode(4);
		TreeNode right = new TreeNode(6);
		TreeNode root = new TreeNode(5, left, right);
		Stack<TreeNode> bfs = new Stack<TreeNode>();
		bfs.push(root);
		iterate(bfs);
		int[] arr = treeList.parallelStream().mapToInt(i -> i).toArray();
		quicksort(arr, 0, arr.length-1);
		System.out.println(arr[k-1]);
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
	
	public static void iterate(Stack<TreeNode> bfs) {
		if(bfs.empty())
			return;
		TreeNode temp = bfs.pop();
		treeList.add(temp.val);
		if(temp.right != null)
			bfs.push(temp.right);
		if(temp.left != null)
			bfs.push(temp.left);
		iterate(bfs);
		return;
	}
}