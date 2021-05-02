import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class WordDictionary {
	
	Set<String> dictionary;
	
	/** Initialize your data structure here. */
    public WordDictionary() {
    	dictionary = new TreeSet<String>();
    }
    
    public void addWord(String word) {
        dictionary.add(word);
    }
    
    public boolean search(String word) {
    	if(word.indexOf(".") >= 0) {
    		Pattern pattern = Pattern.compile(word);
    		return ((dictionary.parallelStream().filter(str -> pattern.matcher(str).find() && word.length() == str.length()).count() > 0) ? true : false);
    	}
    	else
    		return dictionary.contains(word);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
