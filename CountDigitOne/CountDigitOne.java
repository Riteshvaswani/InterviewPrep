
/*https://leetcode.com/problems/number-of-digit-one/
*/

public class CountDigitOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		int count = 0;
		for(int i = n; i >= 1; i--) {
			count += countOnes(i);
		}
		System.out.println(count);
	}
	public static int countOnes(int num) {
		int count = 0;
		while(num != 0) {
			if(num % 10 == 1)
				count++;
			num = num / 10;
		}
		return count;
	}
}
