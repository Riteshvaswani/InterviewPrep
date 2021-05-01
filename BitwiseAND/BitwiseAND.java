
public class BitwiseAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left = 2147483646, right = 2147483647;
		int output = left;
		for(int i = left; i >= left && i <= right; i++) {
			output = output & i;
			if(output == 0)
				break;
		}
		System.out.println(output);
	}

}