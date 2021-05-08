import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
	public static List<List<Integer>> result = new ArrayList<List<Integer>>();
	public static void main(String[] args) {
		int n = 9, k = 3;
		List<Integer> combinations = new ArrayList<Integer>();
		findSum(1, k, n, combinations);
		System.out.println(result);
	}
	public static int findSum(int start, int k, int n, List<Integer> combinations) {
		if(combinations.size() == k) {
			if(n == 0)
				result.add(new ArrayList<Integer>(combinations));
			return -1;
		}
		for(int i = start; i <= 9; i++) {
			combinations.add(i);
			findSum(i+1, k, n-i, combinations);
			combinations.remove((Integer)i);
		}
		return 0;
	}
}
