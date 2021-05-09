import java.util.Arrays;
import java.util.stream.Collectors;

/*https://leetcode.com/problems/reverse-words-in-a-string/
*/

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "blue is sky";
		String[] words = s.split(" ");
		int start = 0, end = words.length - 1;
	    while (start < end) {
	        String temp = words[start];
			words[start] = words[end];
			words[end] = temp;
			start = start + 1;
			end = end - 1;
	    }
	    System.out.println(Arrays.stream(words).filter(str -> !str.isEmpty()).collect(Collectors.joining(" ")));
	}

}
