package dictionary.search;

import dictionary.DictionaryHelper;
import dictionary.search.Trie.Trie;

public class TrieDictionaryHelper implements DictionaryHelper {
    
    private Trie dataTrie = new Trie();

    @Override
    public boolean insert(String word) {
        return dataTrie.insert(word);
    }

    @Override
    public boolean search(String word) {
        return dataTrie.search(word);
    }

    @Override
    public boolean delete(String word) {
        return dataTrie.delete(word);
    }
}
