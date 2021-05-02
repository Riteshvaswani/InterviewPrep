import java.util.Set;
import java.util.TreeSet;

public class Trie {
	
	Set<String> trieSet;

    /** Initialize your data structure here. */
    public Trie() {
        trieSet = new TreeSet<String>();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        trieSet.add(word);
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return trieSet.contains(word);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
    	return trieSet.stream().anyMatch(value -> value.startsWith(prefix));
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}